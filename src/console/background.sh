#!/usr/bin/expect
spawn bash start.sh
set addr [lindex $argv 0]
set i 0
while {$i < 1} {
expect "\[group:1\]>"
send "call Work $addr timer\r"
}
