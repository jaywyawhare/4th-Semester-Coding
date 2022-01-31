# WAP to read a number then check if it is prime or not.

#!/bin/bash

read -p "Enter a number: " num

echo "Terminal is scared of prime numbers wo it will not show output for prime numbers."

for (( i=2; i<=num/2; i++ ))
do
    if [ $(( $num % $i )) -eq 0 ]
    then
        echo "$num is not a prime number"
        exit
    fi
done