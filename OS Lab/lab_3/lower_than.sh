#!/bin/bash
read -p "Enter the number: " num
if [ $num -lt 50 ]
then
    echo "Number is less than 50"
elif [ $num -gt 50 ]
then
    echo "Number is greater than 50"
else
    echo "Number is equal to 50"
fi
