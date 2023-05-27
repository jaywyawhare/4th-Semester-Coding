# Write a Shell Script to add all the numbers from 1 to 20.

#!/bin/bash

# =================================================
# test case

# for (( i=1; i<=20; i++ ))
# do
#     sum=$(( $sum + $i ))
# done
# echo "Sum of all the numbers from 1 to 20 is: $sum"
# =================================================
# General code
read -p "Enter the boundary of range: " num

for (( i=1; i<=num; i++ ))
do
    sum=$(( $sum + $i ))
done
echo "Sum of all the numbers from 1 to $num is $sum"
