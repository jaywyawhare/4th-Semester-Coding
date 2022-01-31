#WAP to print user input i.e. number in words using switch case.
#for example: 123 = one two three

#!/bin/bash
read -p "Enter a number: " num


#use wordcout to find the length of the number
length=`echo $num | wc -c`
length=`expr $length - 1`

for (( i=1; i<=$length; i++ ))
do
    digit=`echo $num
    digit=`expr substr $num $i 1`
    