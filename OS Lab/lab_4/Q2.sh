
#!/bin/bash
read -p "Enter first number: " num1
read -p "Enter second number: " num2
echo "1. Add"
echo "2. Subtract"
echo "3. Multiply"
echo "4. Divide"
read -p "Enter your choice: " choice
case $choice in
    1)
        echo "Addition of $num1 and $num2 is: " `expr $num1 + $num2`
        ;;
    2)
        echo "Subtraction of $num1 and $num2 is: " `expr $num1 - $num2`
        ;;
    3)
        echo "Multiplication of $num1 and $num2 is: " `expr $num1 \* $num2`
        ;;
    4)
        echo "Division of $num1 and $num2 is: " `expr $num1 / $num2`
        ;;
    *)
        echo "Invalid choice"
        ;;
esac
