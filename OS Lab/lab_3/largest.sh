#!/bin/bash

read -p "Enter three numbers: " a b c
if [ $a -gt $b ]
then
    if [ $a -gt $c ]
    then
        echo "$a is the largest"
    else
        echo "$c is the largest"
    fi
elif [ $b -gt $c ]
then
    echo "$b is the largest"
else
    echo "$c is the largest"
fi
