# WAP to swap the pair of elements starting from beginning.

#!/bin/sh

read -p "Enter the number of elements in the array: " n
echo "Enter the elements of the array: "
for (( i=0; i<$n; i++ ))
do
    read a[$i]
done

for (( i=0; i<$n; i+=2 ))
do
    temp=${a[$i]}
    a[$i]=${a[$i+1]}
    a[$i+1]=$temp
done

echo "After swapping:  "
for (( i=0; i<$n; i++ ))
do
    echo ${a[$i]}
done
