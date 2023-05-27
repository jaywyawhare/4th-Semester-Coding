# WAP to find out the second largest element stored in an array.

#!/bin/sh

read -p "Enter the number of elements in the array: " n
echo "Enter the elements of the array: "
for (( i=0; i<$n; i++ ))
do
    read a[$i]
done

max=${a[0]}
secondMax=${a[0]}

for (( i=1; i<$n; i++ ))
do
    if [ ${a[$i]} -gt $max ]
    then
        secondMax=$max
        max=${a[$i]}
    elif [ ${a[$i]} -gt $secondMax ]
    then
        secondMax=${a[$i]}
    fi
done

echo "Second largest element is $secondMax"