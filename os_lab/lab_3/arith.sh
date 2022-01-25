#!/bin/bash
read -p "Enter first number: " a
read -p "Enter second number: " b
sum=$((a+b))
echo "----------------------------------------"
echo "Sum of $a and $b is $sum"
diff=$((a-b))
echo "----------------------------------------"
echo "Difference of $a and $b is $diff"
echo "----------------------------------------"
mul=$((a*b))
echo "Product of $a and $b is $mul"
echo "----------------------------------------"
div=$((a/b))
echo "Quotient of $a and $b is $div"
echo "----------------------------------------"
mod=$((a%b))
echo "Remainder of $a and $b is $mod"
echo "----------------------------------------"
