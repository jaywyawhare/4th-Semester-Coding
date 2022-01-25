#!/bin/bash
read -p "Enter the year: " num
if [ $num -eq 0 ]
then
    echo "Invalid year"
elif [ $(( $num % 4 )) -eq 0 ]
then
    if [ $(( $num % 100 )) -eq 0 ]
    then
        if [ $(( $num % 400 )) -eq 0 ]
        then
            echo "Leap year"
        else
            echo "Not a leap year"
        fi
    else
        echo "Leap year"
    fi
else
    echo "Not a leap year"
fi