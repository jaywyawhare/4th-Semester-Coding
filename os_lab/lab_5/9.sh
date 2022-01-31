# Write shell script to print all prime numbers within two ranges. Ranges input by user.

#!/bin/bash

read -p "Enter the lower Limit :-" lower
read -p "Enter the upper Limit :-" upper
print "Prime numbers between $lower and $upper are :-"
for (( i=$lower; i<=$upper; i++ ))
do
    flag=0
    for (( j=2; j<$i; j++ ))
    do
        if [ `expr $i % $j` -eq 0 ]
        then
            flag=1
            break
        fi
    done
    if [ $flag -eq 0 ]
    then
        echo $i
    fi
done
