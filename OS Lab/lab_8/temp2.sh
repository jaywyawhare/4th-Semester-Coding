#!/bin/bash

read -p "Enter the number : " num

#reverse the number
rev=0
while [ $num -gt 0 ]
do
    rem=$(( $num % 10 ))
    rev=$(( $rev * 10 + $rem ))
    num=$(( $num / 10 ))
done

echo "Reverse of number is $rev"

#find unit tens hundreds digit ... and so on
unit=$(( $rev % 10 ))
tens=$(( $rev / 10 % 10 ))
hund=$(( $rev / 100 % 10 ))
thou=$(( $rev / 1000 % 10 ))
#make a remainig number by removing unit tens hundreds and thousands digit
rem=$(( $rev - $unit *1000 - $tens * 100 - $hund * 10 - $thou ))



#swap tens and thousand 
temp=$tens
tens=$thou
thou=$temp

#make the number
num=$(( $unit * 1000 + $tens * 100 + $hund * 10 + $thou + $rem ))
echo "Swapped number is $num"

#reverse the number
rev=0
while [ $num -gt 0 ]
do
    rem=$(( $num % 10 ))
    rev=$(( $rev * 10 + $rem ))
    num=$(( $num / 10 ))
done
echo "Reverse of swapped number is $rev"
