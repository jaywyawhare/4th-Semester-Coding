# WAP to arrange the numbers stored in the array so that it will display first all odd numbers, then even numbers.

#!/bin/sh

echo "================================================"
echo "ONLINE COMPILOR SUCKS! USE LINUX OS!"
echo "================================================"


mkdir tmp
touch tmp/even.txt
touch tmp/odd.txt

read -p "Enter the number of elements in the array: " n
echo "Enter the elements of the array: "
for (( i=0; i<$n; i++ ))
do
    read a[$i]
done

for (( i=0; i<$n; i++ ))
do
    even_check=$((${a[$i]}%2))
    if [ $even_check -eq 0 ]
    then
        echo ${a[$i]} >> tmp/even.txt
    else
        echo ${a[$i]} >> tmp/odd.txt
    fi
done

echo "After sorting:  "

sort -n tmp/odd.txt
sort -n tmp/even.txt

rm -rf tmp
