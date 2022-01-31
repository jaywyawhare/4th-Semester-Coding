# WAP to print all the natural numbers between 1 to n in reverse order

#!/bin/bash
read -p "Enter the boundary of range: " num
for (( i=$num; i>=1; i-- ))
do
    echo $i
done
