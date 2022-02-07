# Find largest and smallest element in an array

#!/bin/bash

read -p "Enter number of elements: " n

echo "Enter elements"
for((i=0;i<$n;i++))
do
    read a[$i]
done

max=${a[0]}
min=${a[0]}

for((i=1;i<$n;i++))
do
    if [ ${a[$i]} -gt $max ]
    then
        max=${a[$i]}
    fi

    if [ ${a[$i]} -lt $min ]
    then
        min=${a[$i]}
    fi
done
echo "Largest element is $max"
echo "Smallest element is $min"
