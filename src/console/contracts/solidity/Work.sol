pragma solidity ^0.4.25;

contract Work{
    mapping(address=>uint) balances;
    constructor() public{

    }
    function deposit(uint amount)public returns(uint){
        balances[msg.sender]+=amount;
        return balances[msg.sender];
    }
    function transfer(address sender,address receiver,uint amount)public returns(uint){
        balances[receiver]+=amount;
        balances[sender]-=amount;
        return (balances[sender]);
    }
    function getAddress()public view returns(address){
        return msg.sender;
    }
    function getBalance()public view returns(uint){
        return balances[msg.sender];
    }

    mapping(address=>address) debtors;
    mapping(address=>address) creditors;
    mapping(address=>uint) accountsReceivables;
    mapping(address=>uint) refundDates;
    mapping(address=>bool) validBits;
    address[] contractList;
    function init(address creditor,uint accountsReceivable,uint lastTime)public returns(address){
        address addr=address(uint160(keccak256(abi.encodePacked(now,msg.sender))));
        debtors[addr]=msg.sender;
        creditors[addr]=creditor;
        accountsReceivables[addr]=accountsReceivable;
        refundDates[addr]=now+lastTime;
        validBits[addr]=true;
        contractList.push(addr);
        return addr;
    }  
    function transferContract(address newCreditor,address oldAddr) public returns(address){
        address newAddr=address(uint160(keccak256(abi.encodePacked(now,msg.sender))));
        debtors[newAddr]=debtors[oldAddr];
        creditors[newAddr]=newCreditor;
        accountsReceivables[newAddr]=accountsReceivables[oldAddr];
        refundDates[newAddr]=refundDates[oldAddr];
        validBits[newAddr]=true;
        validBits[oldAddr]=false;
        contractList.push(newAddr);
        return newAddr;
    }
    function getContract(address addr)public returns(address,address,uint,uint,bool){
        return (debtors[addr],creditors[addr],accountsReceivables[addr],refundDates[addr],validBits[addr]);
    }
    function timer()public returns(uint){
        for(uint i=0;i<contractList.length;i++){
            if(validBits[contractList[i]]==true){
                if(now>=refundDates[contractList[i]]){
                    validBits[contractList[i]]=false;
                   return( transfer(debtors[contractList[i]],creditors[contractList[i]],accountsReceivables[contractList[i]]) );
                }
            }
        }
        return now;
    }
}