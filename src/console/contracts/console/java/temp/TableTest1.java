package temp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.fisco.bcos.channel.client.TransactionSucCallback;
import org.fisco.bcos.channel.event.filter.EventLogPushWithDecodeCallback;
import org.fisco.bcos.web3j.abi.EventEncoder;
import org.fisco.bcos.web3j.abi.TypeReference;
import org.fisco.bcos.web3j.abi.datatypes.DynamicArray;
import org.fisco.bcos.web3j.abi.datatypes.Event;
import org.fisco.bcos.web3j.abi.datatypes.Function;
import org.fisco.bcos.web3j.abi.datatypes.Type;
import org.fisco.bcos.web3j.abi.datatypes.Utf8String;
import org.fisco.bcos.web3j.abi.datatypes.generated.Int256;
import org.fisco.bcos.web3j.crypto.Credentials;
import org.fisco.bcos.web3j.protocol.Web3j;
import org.fisco.bcos.web3j.protocol.core.RemoteCall;
import org.fisco.bcos.web3j.protocol.core.methods.response.Log;
import org.fisco.bcos.web3j.protocol.core.methods.response.TransactionReceipt;
import org.fisco.bcos.web3j.tuples.generated.Tuple3;
import org.fisco.bcos.web3j.tx.Contract;
import org.fisco.bcos.web3j.tx.TransactionManager;
import org.fisco.bcos.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.fisco.bcos.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version none.
 */
@SuppressWarnings("unchecked")
public class TableTest1 extends Contract {
    public static String BINARY = "608060405234801561001057600080fd5b5061214e806100206000396000f30060806040526004361061006d576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff168063487a5a1014610072578063c4f41ab3146100af578063ebf3b24f146100ec578063efc81a8c14610129578063fcd7e3c114610154575b600080fd5b34801561007e57600080fd5b50610099600480360361009491908101906119a7565b610193565b6040516100a69190611d1e565b60405180910390f35b3480156100bb57600080fd5b506100d660048036036100d19190810190611953565b61060c565b6040516100e39190611d1e565b60405180910390f35b3480156100f857600080fd5b50610113600480360361010e91908101906119a7565b61095b565b6040516101209190611d1e565b60405180910390f35b34801561013557600080fd5b5061013e610d32565b60405161014b9190611d1e565b60405180910390f35b34801561016057600080fd5b5061017b600480360361017691908101906118d1565b610e22565b60405161018a93929190611cd2565b60405180910390f35b60008060008060008061100194508473ffffffffffffffffffffffffffffffffffffffff1663f23f63c96040518163ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016101f490611e5f565b602060405180830381600087803b15801561020e57600080fd5b505af1158015610222573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610246919081019061187f565b93508373ffffffffffffffffffffffffffffffffffffffff166313db93466040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156102ac57600080fd5b505af11580156102c0573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506102e49190810190611856565b92508273ffffffffffffffffffffffffffffffffffffffff1663e942b516886040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161033b9190611ee5565b600060405180830381600087803b15801561035557600080fd5b505af1158015610369573d6000803e3d6000fd5b505050508373ffffffffffffffffffffffffffffffffffffffff16637857d7c96040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156103d157600080fd5b505af11580156103e5573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506104099190810190611804565b91508173ffffffffffffffffffffffffffffffffffffffff1663cd30a1d18a6040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016104609190611df7565b600060405180830381600087803b15801561047a57600080fd5b505af115801561048e573d6000803e3d6000fd5b505050508173ffffffffffffffffffffffffffffffffffffffff1663e44594b9896040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016104e79190611f3a565b600060405180830381600087803b15801561050157600080fd5b505af1158015610515573d6000803e3d6000fd5b505050508373ffffffffffffffffffffffffffffffffffffffff1663bf2b70a18a85856040518463ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161057293929190611d99565b602060405180830381600087803b15801561058c57600080fd5b505af11580156105a0573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506105c491908101906118a8565b90507f8e5890af40fc24a059396aca2f83d6ce41fcef086876548fa4fb8ec27e9d292a816040516105f59190611d1e565b60405180910390a180955050505050509392505050565b600080600080600061100193508373ffffffffffffffffffffffffffffffffffffffff1663f23f63c96040518163ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161066c90611e5f565b602060405180830381600087803b15801561068657600080fd5b505af115801561069a573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506106be919081019061187f565b92508273ffffffffffffffffffffffffffffffffffffffff16637857d7c96040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15801561072457600080fd5b505af1158015610738573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525061075c9190810190611804565b91508173ffffffffffffffffffffffffffffffffffffffff1663cd30a1d1886040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016107b39190611df7565b600060405180830381600087803b1580156107cd57600080fd5b505af11580156107e1573d6000803e3d6000fd5b505050508173ffffffffffffffffffffffffffffffffffffffff1663e44594b9876040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161083a9190611f3a565b600060405180830381600087803b15801561085457600080fd5b505af1158015610868573d6000803e3d6000fd5b505050508273ffffffffffffffffffffffffffffffffffffffff166328bb211788846040518363ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016108c3929190611d39565b602060405180830381600087803b1580156108dd57600080fd5b505af11580156108f1573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525061091591908101906118a8565b90507f4b930e280fe29620bdff00c88155d46d6d82a39f45dd5c3ea114dc3157358112816040516109469190611d1e565b60405180910390a18094505050505092915050565b600080600080600061100193508373ffffffffffffffffffffffffffffffffffffffff1663f23f63c96040518163ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016109bb90611e5f565b602060405180830381600087803b1580156109d557600080fd5b505af11580156109e9573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610a0d919081019061187f565b92508273ffffffffffffffffffffffffffffffffffffffff166313db93466040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b158015610a7357600080fd5b505af1158015610a87573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610aab9190810190611856565b91508173ffffffffffffffffffffffffffffffffffffffff1663e942b516896040518263ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610b029190611df7565b600060405180830381600087803b158015610b1c57600080fd5b505af1158015610b30573d6000803e3d6000fd5b505050508173ffffffffffffffffffffffffffffffffffffffff16632ef8ba74886040518263ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610b899190611f3a565b600060405180830381600087803b158015610ba357600080fd5b505af1158015610bb7573d6000803e3d6000fd5b505050508173ffffffffffffffffffffffffffffffffffffffff1663e942b516876040518263ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610c109190611ee5565b600060405180830381600087803b158015610c2a57600080fd5b505af1158015610c3e573d6000803e3d6000fd5b505050508273ffffffffffffffffffffffffffffffffffffffff166331afac3689846040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610c99929190611d69565b602060405180830381600087803b158015610cb357600080fd5b505af1158015610cc7573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610ceb91908101906118a8565b90507fc57b01fa77f41df77eaab79a0e2623fab2e7ae3e9530d9b1cab225ad65f2b7ce81604051610d1c9190611d1e565b60405180910390a1809450505050509392505050565b600080600061100191508173ffffffffffffffffffffffffffffffffffffffff166356004b6a6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610d8f90611e7f565b602060405180830381600087803b158015610da957600080fd5b505af1158015610dbd573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610de191908101906118a8565b90507fb5636cd912a73dcdb5b570dbe331dfa3e6435c93e029e642def2c8e40dacf21081604051610e129190611d1e565b60405180910390a1809250505090565b6060806060600080600080606080606060008061100198508873ffffffffffffffffffffffffffffffffffffffff1663f23f63c96040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610e8d90611e5f565b602060405180830381600087803b158015610ea757600080fd5b505af1158015610ebb573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610edf919081019061187f565b97508773ffffffffffffffffffffffffffffffffffffffff16637857d7c96040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b158015610f4557600080fd5b505af1158015610f59573d6000803e3d6000fd5b505050506040513d601f19601f82011682018060405250610f7d9190810190611804565b96508673ffffffffffffffffffffffffffffffffffffffff1663cd30a1d16040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401610fd290611e2c565b600060405180830381600087803b158015610fec57600080fd5b505af1158015611000573d6000803e3d6000fd5b505050508773ffffffffffffffffffffffffffffffffffffffff1663e8434e398e896040518363ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161105b929190611d39565b602060405180830381600087803b15801561107557600080fd5b505af1158015611089573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506110ad919081019061182d565b95508573ffffffffffffffffffffffffffffffffffffffff1663949d225d6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15801561111357600080fd5b505af1158015611127573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525061114b91908101906118a8565b60405190808252806020026020018201604052801561117e57816020015b60608152602001906001900390816111695790505b5094508573ffffffffffffffffffffffffffffffffffffffff1663949d225d6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156111e557600080fd5b505af11580156111f9573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525061121d91908101906118a8565b60405190808252806020026020018201604052801561124b5781602001602082028038833980820191505090505b5093508573ffffffffffffffffffffffffffffffffffffffff1663949d225d6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156112b257600080fd5b505af11580156112c6573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506112ea91908101906118a8565b60405190808252806020026020018201604052801561131d57816020015b60608152602001906001900390816113085790505b509250600091505b8573ffffffffffffffffffffffffffffffffffffffff1663949d225d6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15801561138957600080fd5b505af115801561139d573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506113c191908101906118a8565b8212156116c7578573ffffffffffffffffffffffffffffffffffffffff1663846719e0836040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161141d9190611d1e565b602060405180830381600087803b15801561143757600080fd5b505af115801561144b573d6000803e3d6000fd5b505050506040513d601f19601f8201168201806040525061146f9190810190611856565b90508073ffffffffffffffffffffffffffffffffffffffff16639c981fcb6040518163ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004016114c490611dd7565b600060405180830381600087803b1580156114de57600080fd5b505af11580156114f2573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f8201168201806040525061151b9190810190611912565b858381518110151561152957fe5b906020019060200201819052508073ffffffffffffffffffffffffffffffffffffffff1663fda69fae6040518163ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161158990611f1a565b602060405180830381600087803b1580156115a357600080fd5b505af11580156115b7573d6000803e3d6000fd5b505050506040513d601f19601f820116820180604052506115db91908101906118a8565b84838151811015156115e957fe5b90602001906020020181815250508073ffffffffffffffffffffffffffffffffffffffff16639c981fcb6040518163ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040161164a90611ec5565b600060405180830381600087803b15801561166457600080fd5b505af1158015611678573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f820116820180604052506116a19190810190611912565b83838151811015156116af57fe5b90602001906020020181905250816001019150611325565b8484849b509b509b505050505050505050509193909250565b60006116ec825161204b565b905092915050565b6000611700825161205d565b905092915050565b6000611714825161206f565b905092915050565b60006117288251612081565b905092915050565b600061173c8235612093565b905092915050565b60006117508251612093565b905092915050565b600082601f830112151561176b57600080fd5b813561177e61177982611f95565b611f68565b9150808252602083016020830185838301111561179a57600080fd5b6117a58382846120c1565b50505092915050565b600082601f83011215156117c157600080fd5b81516117d46117cf82611f95565b611f68565b915080825260208301602083018583830111156117f057600080fd5b6117fb8382846120d0565b50505092915050565b60006020828403121561181657600080fd5b6000611824848285016116e0565b91505092915050565b60006020828403121561183f57600080fd5b600061184d848285016116f4565b91505092915050565b60006020828403121561186857600080fd5b600061187684828501611708565b91505092915050565b60006020828403121561189157600080fd5b600061189f8482850161171c565b91505092915050565b6000602082840312156118ba57600080fd5b60006118c884828501611744565b91505092915050565b6000602082840312156118e357600080fd5b600082013567ffffffffffffffff8111156118fd57600080fd5b61190984828501611758565b91505092915050565b60006020828403121561192457600080fd5b600082015167ffffffffffffffff81111561193e57600080fd5b61194a848285016117ae565b91505092915050565b6000806040838503121561196657600080fd5b600083013567ffffffffffffffff81111561198057600080fd5b61198c85828601611758565b925050602061199d85828601611730565b9150509250929050565b6000806000606084860312156119bc57600080fd5b600084013567ffffffffffffffff8111156119d657600080fd5b6119e286828701611758565b93505060206119f386828701611730565b925050604084013567ffffffffffffffff811115611a1057600080fd5b611a1c86828701611758565b9150509250925092565b6000611a3182611fdb565b808452602084019350611a4383611fc1565b60005b82811015611a7557611a59868351611b0d565b611a6282612007565b9150602086019550600181019050611a46565b50849250505092915050565b6000611a8c82611fe6565b80845260208401935083602082028501611aa585611fce565b60005b84811015611ade578383038852611ac0838351611b52565b9250611acb82612014565b9150602088019750600181019050611aa8565b508196508694505050505092915050565b611af88161209d565b82525050565b611b07816120af565b82525050565b611b1681612041565b82525050565b6000611b2782611ffc565b808452611b3b8160208601602086016120d0565b611b4481612103565b602085010191505092915050565b6000611b5d82611ff1565b808452611b718160208601602086016120d0565b611b7a81612103565b602085010191505092915050565b6000600482527f6e616d65000000000000000000000000000000000000000000000000000000006020830152604082019050919050565b6000600682527f745f7465737400000000000000000000000000000000000000000000000000006020830152604082019050919050565b6000600982527f6974656d5f6e616d6500000000000000000000000000000000000000000000006020830152604082019050919050565b6000600782527f6974656d5f6964000000000000000000000000000000000000000000000000006020830152604082019050919050565b6000601182527f6974656d5f69642c6974656d5f6e616d650000000000000000000000000000006020830152604082019050919050565b6000600382527f6c676c00000000000000000000000000000000000000000000000000000000006020830152604082019050919050565b60006060820190508181036000830152611cec8186611a81565b90508181036020830152611d008185611a26565b90508181036040830152611d148184611a81565b9050949350505050565b6000602082019050611d336000830184611b0d565b92915050565b60006040820190508181036000830152611d538185611b1c565b9050611d626020830184611aef565b9392505050565b60006040820190508181036000830152611d838185611b1c565b9050611d926020830184611afe565b9392505050565b60006060820190508181036000830152611db38186611b1c565b9050611dc26020830185611afe565b611dcf6040830184611aef565b949350505050565b60006020820190508181036000830152611df081611b88565b9050919050565b60006040820190508181036000830152611e1081611b88565b90508181036020830152611e248184611b1c565b905092915050565b60006040820190508181036000830152611e4581611b88565b90508181036020830152611e5881611c9b565b9050919050565b60006020820190508181036000830152611e7881611bbf565b9050919050565b60006060820190508181036000830152611e9881611bbf565b90508181036020830152611eab81611b88565b90508181036040830152611ebe81611c64565b9050919050565b60006020820190508181036000830152611ede81611bf6565b9050919050565b60006040820190508181036000830152611efe81611bf6565b90508181036020830152611f128184611b1c565b905092915050565b60006020820190508181036000830152611f3381611c2d565b9050919050565b60006040820190508181036000830152611f5381611c2d565b9050611f626020830184611b0d565b92915050565b6000604051905081810181811067ffffffffffffffff82111715611f8b57600080fd5b8060405250919050565b600067ffffffffffffffff821115611fac57600080fd5b601f19601f8301169050602081019050919050565b6000602082019050919050565b6000602082019050919050565b600081519050919050565b600081519050919050565b600081519050919050565b600081519050919050565b6000602082019050919050565b6000602082019050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b600061205682612021565b9050919050565b600061206882612021565b9050919050565b600061207a82612021565b9050919050565b600061208c82612021565b9050919050565b6000819050919050565b60006120a882612021565b9050919050565b60006120ba82612021565b9050919050565b82818337600083830152505050565b60005b838110156120ee5780820151818401526020810190506120d3565b838111156120fd576000848401525b50505050565b6000601f19601f83011690509190505600a265627a7a723058207b212c4a26c10e2bb431eebd7c86b8a72340f76097a76d8e0a4f8ac22c48fc576c6578706572696d656e74616cf50037";

    public static final String ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"item_id\",\"type\":\"int256\"},{\"name\":\"item_name\",\"type\":\"string\"}],\"name\":\"update\",\"outputs\":[{\"name\":\"\",\"type\":\"int256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"item_id\",\"type\":\"int256\"}],\"name\":\"remove\",\"outputs\":[{\"name\":\"\",\"type\":\"int256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"item_id\",\"type\":\"int256\"},{\"name\":\"item_name\",\"type\":\"string\"}],\"name\":\"insert\",\"outputs\":[{\"name\":\"\",\"type\":\"int256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"create\",\"outputs\":[{\"name\":\"\",\"type\":\"int256\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"name\",\"type\":\"string\"}],\"name\":\"select\",\"outputs\":[{\"name\":\"\",\"type\":\"string[]\"},{\"name\":\"\",\"type\":\"int256[]\"},{\"name\":\"\",\"type\":\"string[]\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"count\",\"type\":\"int256\"}],\"name\":\"CreateResult\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"count\",\"type\":\"int256\"}],\"name\":\"InsertResult\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"count\",\"type\":\"int256\"}],\"name\":\"UpdateResult\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"count\",\"type\":\"int256\"}],\"name\":\"RemoveResult\",\"type\":\"event\"}]";

    public static final String FUNC_UPDATE = "update";

    public static final String FUNC_REMOVE = "remove";

    public static final String FUNC_INSERT = "insert";

    public static final String FUNC_CREATE = "create";

    public static final String FUNC_SELECT = "select";

    public static final Event CREATERESULT_EVENT = new Event("CreateResult", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
    ;

    public static final Event INSERTRESULT_EVENT = new Event("InsertResult", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
    ;

    public static final Event UPDATERESULT_EVENT = new Event("UpdateResult", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
    ;

    public static final Event REMOVERESULT_EVENT = new Event("RemoveResult", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
    ;

    @Deprecated
    protected TableTest1(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TableTest1(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TableTest1(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TableTest1(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> update(String name, BigInteger item_id, String item_name) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(item_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void update(String name, BigInteger item_id, String item_name, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(item_name)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String updateSeq(String name, BigInteger item_id, String item_name) {
        final Function function = new Function(
                FUNC_UPDATE, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(item_name)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<TransactionReceipt> remove(String name, BigInteger item_id) {
        final Function function = new Function(
                FUNC_REMOVE, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void remove(String name, BigInteger item_id, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_REMOVE, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String removeSeq(String name, BigInteger item_id) {
        final Function function = new Function(
                FUNC_REMOVE, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<TransactionReceipt> insert(String name, BigInteger item_id, String item_name) {
        final Function function = new Function(
                FUNC_INSERT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(item_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void insert(String name, BigInteger item_id, String item_name, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_INSERT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(item_name)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String insertSeq(String name, BigInteger item_id, String item_name) {
        final Function function = new Function(
                FUNC_INSERT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Int256(item_id), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(item_name)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<TransactionReceipt> create() {
        final Function function = new Function(
                FUNC_CREATE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void create(TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_CREATE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String createSeq() {
        final Function function = new Function(
                FUNC_CREATE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<Tuple3<List<String>, List<BigInteger>, List<String>>> select(String name) {
        final Function function = new Function(FUNC_SELECT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}, new TypeReference<DynamicArray<Int256>>() {}, new TypeReference<DynamicArray<Utf8String>>() {}));
        return new RemoteCall<Tuple3<List<String>, List<BigInteger>, List<String>>>(
                new Callable<Tuple3<List<String>, List<BigInteger>, List<String>>>() {
                    @Override
                    public Tuple3<List<String>, List<BigInteger>, List<String>> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<List<String>, List<BigInteger>, List<String>>(
                                convertToNative((List<Utf8String>) results.get(0).getValue()), 
                                convertToNative((List<Int256>) results.get(1).getValue()), 
                                convertToNative((List<Utf8String>) results.get(2).getValue()));
                    }
                });
    }

    public List<CreateResultEventResponse> getCreateResultEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CREATERESULT_EVENT, transactionReceipt);
        ArrayList<CreateResultEventResponse> responses = new ArrayList<CreateResultEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CreateResultEventResponse typedResponse = new CreateResultEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public void registerCreateResultEventLogFilter(String fromBlock, String toBlock, List<String> otherTopcs, EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(CREATERESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,fromBlock,toBlock,otherTopcs,callback);
    }

    public void registerCreateResultEventLogFilter(EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(CREATERESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,callback);
    }

    public List<InsertResultEventResponse> getInsertResultEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(INSERTRESULT_EVENT, transactionReceipt);
        ArrayList<InsertResultEventResponse> responses = new ArrayList<InsertResultEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            InsertResultEventResponse typedResponse = new InsertResultEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public void registerInsertResultEventLogFilter(String fromBlock, String toBlock, List<String> otherTopcs, EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(INSERTRESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,fromBlock,toBlock,otherTopcs,callback);
    }

    public void registerInsertResultEventLogFilter(EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(INSERTRESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,callback);
    }

    public List<UpdateResultEventResponse> getUpdateResultEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(UPDATERESULT_EVENT, transactionReceipt);
        ArrayList<UpdateResultEventResponse> responses = new ArrayList<UpdateResultEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UpdateResultEventResponse typedResponse = new UpdateResultEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public void registerUpdateResultEventLogFilter(String fromBlock, String toBlock, List<String> otherTopcs, EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(UPDATERESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,fromBlock,toBlock,otherTopcs,callback);
    }

    public void registerUpdateResultEventLogFilter(EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(UPDATERESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,callback);
    }

    public List<RemoveResultEventResponse> getRemoveResultEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(REMOVERESULT_EVENT, transactionReceipt);
        ArrayList<RemoveResultEventResponse> responses = new ArrayList<RemoveResultEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RemoveResultEventResponse typedResponse = new RemoveResultEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public void registerRemoveResultEventLogFilter(String fromBlock, String toBlock, List<String> otherTopcs, EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(REMOVERESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,fromBlock,toBlock,otherTopcs,callback);
    }

    public void registerRemoveResultEventLogFilter(EventLogPushWithDecodeCallback callback) {
        String topic0 = EventEncoder.encode(REMOVERESULT_EVENT);
        registerEventLogPushFilter(ABI,BINARY,topic0,callback);
    }

    @Deprecated
    public static TableTest1 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TableTest1(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TableTest1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TableTest1(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TableTest1 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TableTest1(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TableTest1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TableTest1(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TableTest1> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TableTest1.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TableTest1> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TableTest1.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<TableTest1> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TableTest1.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TableTest1> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TableTest1.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class CreateResultEventResponse {
        public Log log;

        public BigInteger count;
    }

    public static class InsertResultEventResponse {
        public Log log;

        public BigInteger count;
    }

    public static class UpdateResultEventResponse {
        public Log log;

        public BigInteger count;
    }

    public static class RemoveResultEventResponse {
        public Log log;

        public BigInteger count;
    }
}
