# WAP to read a number then check if it is prime or not.

#!/bin/bash

read -p "Enter a number: " num

for (( i=2; i<=num/2; i++ ))
do  
    if [ $(( $num % $i )) -eq 0 ]
    then
        echo "$num is not a prime number"
        exit
    fi
        echo "$num is a prime number"
done
