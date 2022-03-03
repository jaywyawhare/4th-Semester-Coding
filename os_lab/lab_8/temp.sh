#write a shell program to swap tenth and hundredth digit of a reverse of number
#!/bin/sh

read -p "size of number: " size
read -p "Enter a number: " number

for (( i=0; i<$size; i++ ))
do
    digit[$i]=${number:$i:1}
done

#swap $digit[1] and $digit[3] and print the result
temp=${digit[1]}
digit[1]=${digit[3]}
digit[3]=$temp

for (( i=0; i<$size; i++ ))
do
    echo -n ${digit[$i]}
done