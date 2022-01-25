
#!/bin/bash

read -p "Enter a number: " num
case $num in
    1)
        echo "One"
        ;;
    2)
        echo "Two"
        ;;
    3)
        echo "Three"
        ;;
    *)
        echo "Invalid number"
        ;;
esac
