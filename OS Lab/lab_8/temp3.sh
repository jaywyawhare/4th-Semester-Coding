# Write shell script to display present working directory,contains of directory and date using loop.

#!/bin/bash
for ((i=1;i<5;i++))
do
    #swith case
    case $i in
        1)
            echo "present working directory"
            pwd
            ;;
        2)
            echo "contains of directory"
            ls
            ;;
        3)
            echo "date"
            date
            ;;
        4)
            echo "exit"
            exit
            ;;
        *)
            echo "invalid input"
            ;;
    esac
    echo
done