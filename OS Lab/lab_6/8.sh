# WAP to swap first element with last, second element with second last and so on, stored in an array.


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

#!/bin/sh
read -p "Enter the number of elements in the array: " n
echo "Enter the elements of the array: "
for (( i=0; i<$n; i++ ))
do
    read a[$i]
done

for (( i=0; i<$n; i++ ))
do
    for (( j=$i+1; j<$n; j++ ))
    do
        temp=${a[$i]}
        a[$i]=${a[$j]}
        a[$j]=$temp
    done
done
echo "After swapping:  "
echo "${a[@]}"
