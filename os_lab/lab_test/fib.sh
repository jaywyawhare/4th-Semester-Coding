#first 10 numbers in fibonacci series

#!/bin/bash

echo "Fisrt 10 numbers in fibonacci series"

a=0
b=1

for ((i=0;i<10;i++))
do
	echo -n "$a "
	c=$(($a+$b))
	a=$b
	b=$c
done
echo