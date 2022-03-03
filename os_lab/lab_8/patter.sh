#create a pattern using loop
#  7 6 5 4 3 2 1
#   5 4 3 2 1 
#    3 2 1
#      1



#!/bin/sh

read -p "Enter the number of rows: " rows
read -p "Enter the number of columns: " columns

for (( i=1; i<=$rows; i++ ))
do
    for (( j=1; j<=$columns; j++ ))
    do
        if [ $i -eq 1 ] || [ $i -eq $rows ] || [ $j -eq 1 ] || [ $j -eq $columns ]
        then
            echo -n "*"
        else
            echo -n " "
        fi
    done
    echo ""
done

# for (( i = 0; i < line; i++ ))
# do
#     for (( j = 0; j < start_num; j++ ))
#     do
#         echo -n " "
#     done
#     for (( j = start_num; j > 0; j-- ))
#     do
#         echo -n "$j "
#     done
#     echo ""
#     start_num = $(( start_num - 1 ))
# done
