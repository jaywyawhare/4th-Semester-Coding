# Write a script to find the area of a triangle by passing 3 sides of the triangle and check the triangle is possible or not.

#!/bin/bash

read -p "Enter side 1: " side1
read -p "Enter side 2: " side2
read -p "Enter side 3: " side3

if [ $side1 -eq $side2 -a $side2 -eq $side3 ]
then
    echo "Equilateral triangle"
elif [ $side1 -eq $side2 -o $side2 -eq $side3 -o $side1 -eq $side3 ]
then
    echo "Isosceles triangle"
else
    echo "Scalene triangle"
fi

if [ $side1 -lt $side2 -a $side2 -lt $side3 ]
then
    echo "The triangle is possible"
else
    echo "The triangle is not possible"
fi  

#area of triangle

#!/bin/bash
read -p "Enter side 1: " side1
read -p "Enter side 2: " side2
read -p "Enter side 3: " side3



