# Find sum of all elements.

#!/bin/bash

read -p "Enter number of elements: " n

echo "Enter elements"
for((i=0;i<$n;i++))
do
    read a[$i]
done

for ((i=0;i<$n;i++))
do
    sum=$((sum+${a[$i]}))
done

echo "Sum of all elements is $sum"