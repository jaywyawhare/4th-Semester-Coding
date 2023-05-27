# Wap to check a number is single digit  or 2 digit or 3 digit number using shell script switch case

#!/bin/sh
read -p "Enter a number: " num
case $num in
	[1-9])
		echo "Single digit number"
		;;
	[1-9][0-9])
		echo "Two digit number"
		;;
	[1-9][0-9][0-9])
		echo "Three digit number"
		;;
	*)
		echo "Invalid number"
		;;
esac