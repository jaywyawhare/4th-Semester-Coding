
#!/bin/sh

# check the number is between 1 to 10 or 10-20 or 20-30 or 30-40 or 40-50 or 50-60 or 60-70 or 70-80 or 80-90 or 90-100 using switch case and regular expression 


read -p "Enter a number: " num

case $num in

    [1-9]|[1-9][0-9])
        echo "O"
        ;;
    [1-9][0-9][0-9])
        echo "E"
        ;;
    [1-9][0-9][0-9][0-9])
        echo "A"
        ;;
    [1-9][0-9][0-9][0-9][0-9])
        echo "B"
        ;;
    [1-9][0-9][0-9][0-9][0-9][0-9])
        echo "C"
        ;;
    [1-9][0-9][0-9][0-9][0-9][0-9][0-9])
        echo "D"
        ;;
    [1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])
        echo "E"
        ;;
    [1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9])
        echo "F"
        ;;
    *)
        echo "Invalid number"
        ;;
esac