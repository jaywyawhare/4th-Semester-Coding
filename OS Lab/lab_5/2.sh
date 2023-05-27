# WAP to add all the even numbers from 1 to 20.

#!/bin/bash
# =================================================================
# Test Case
# for (( i=1; i<=20; i++ ))
# do
#     if [ $(( $i % 2 )) -eq 0 ]
#     then
#         sum=$(( $sum + $i ))
#     fi
# done
# echo "Sum of all the even numbers from 1 to 20 is: $sum"
    
# =================================================================
#  General code

read -p "Enter the boundary of range: " num

for (( i=1; i<=num; i++ ))
do
    if [ $(( $i % 2 )) -eq 0 ]
    then
        sum=$(( $sum + $i ))
    fi
done
echo "Sum of all the even numbers from 1 to $num is $sum"