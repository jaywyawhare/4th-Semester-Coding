# Wap to check a number is single digit  or 2 digit or 3 digit number using shell script switch case

#!/bin/sh
read -p "Enter a number: " num
case $num in

	[9][0-9])
		echo "O"
		;;
	[8][0-9])
		echo "E"
		;;
    [7][0-9])
		echo "A"
		;;
    [6][0-9])
		echo "B"
		;;
    [5][0-9])
		echo "You are Failed, F for you!"
		;;            
	*)
		echo "Invalid number"
		;;
esac