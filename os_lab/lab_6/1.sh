# Write a shell script to input n elements to an array and display in forward and backward direction.

#!/bin/bash


echo "Enter n elements"
read n

echo "Enter elements"
for((i=0;i<$n;i++))
do
	read a[$i]
done

echo "Elements in forward direction"

for((i=0;i<$n;i++))
do
    echo ${a[$i]}
done

echo "Elements in backward direction"

for((i=$n-1;i>=0;i--))
do
    echo ${a[$i]}
done
