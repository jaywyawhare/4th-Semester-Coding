# WAP to swap first element with last, second element with second last and so on, stored in an array.

#!/bin/sh

# echo "Only valid for single digit inputs"

# read -p "Enter the number of elements in the array: " n
# echo "Enter the elements of the array: "
# for (( i=0; i<$n; i++ ))
# do
#     read a[$i]
# done

# echo "After swapping:  "
# echo "${a[@]}" | rev

# =================================================================================================================

read -p "Enter the number of elements in the array: " n
echo "Enter the elements of the array: "
for (( i=0; i<$n; i++ ))
do
    read a[$i]
done

echo "After swapping:  "

for (( i=$n; i>=0; i-- ))
do
    echo ${a[$i]}
done