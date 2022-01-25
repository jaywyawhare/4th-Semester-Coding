# Write a shell script to input a character and display is it a number, or lowercase letter, or upper case letter or special character.

#!/bin/bash 
read -p "Enter a character: " ch
case $ch in
    [0-9])
        echo "Number"
        ;;
    [a-z])
        echo "Lowercase letter"
        ;;
    [A-Z])
        echo "Uppercase letter"
        ;;
    *)
        echo "Special character"
        ;;
esac
