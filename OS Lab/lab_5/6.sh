# WAP to print all the natural numbers between 1 to 100 in different line, the user enter how many elements want to print in a line.

#!/bin/bash
read -p "Enter the number of elements in a line: " num
for (( i=1; i<=num; i++ ))
do
    for (( j=1; j<=i; j++ ))
    do
        echo -n "$j "
    done
    echo
done
