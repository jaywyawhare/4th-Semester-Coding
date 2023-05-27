# WAP  to add all the numbers from 1 to n.

#!/bin/bash

# ================================
# Code 1
# read -p "Enter the boundary of range: " num
#
# for (( i=1; i<=num; i++ ))
# do
#     sum=$(( $sum + $i ))
# done
# echo "Sum of all the numbers from 1 to $num is $sum"

# ================================
# Code 2
read -p "Enter the boundary of range: " num
echo "Sum of all the numbers from 1 to $num is $(( $num * ( $num + 1 ) / 2 ))"