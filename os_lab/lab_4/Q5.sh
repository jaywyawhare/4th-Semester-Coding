# Write a script the check the number is palindrome or not of 3 digit number.

#!/bin/bash
read -p "Enter a 3 digit number: " num
rev=0
temp=$num
while [ $num -gt 0 ]
do
    rem=$(( $num % 10 ))
    rev=$(( $rev * 10 + $rem ))
    num=$(( $num / 10 ))
done
if [ $temp -eq $rev ]
then
    echo "The number is palindrome"
else
    echo "The number is not palindrome"
fi
