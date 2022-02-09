# WAP to find the mean, median and standard deviation of a list of numbers in array.

#!/bin/sh

echo "====================================================================================="
echo "ONLINE COMPILOR SUCKS! USE LINUX OS!"
echo "====================================================================================="

mkdir tmp
touch tmp/mean.c
touch tmp/median.c
touch tmp/stddev.c

echo "#include <stdio.h>" >> tmp/mean.c
echo "#include <math.h>" >> tmp/mean.c
echo "int main()" >> tmp/mean.c
echo "{" >> tmp/mean.c
echo "    int i;" >> tmp/mean.c
echo "    int sum = 0;" >> tmp/mean.c
echo "    int n;" >> tmp/mean.c
echo "    printf(\"Enter the number of elements in the array: \");" >> tmp/mean.c
echo "    scanf(\"%d\", &n);" >> tmp/mean.c
echo "    int a[n];" >> tmp/mean.c
echo "    printf(\"Enter the elements of the array: \");" >> tmp/mean.c
echo "    for (i = 0; i < n; i++)" >> tmp/mean.c
echo "    {" >> tmp/mean.c
echo "        scanf(\"%d\", &a[i]);" >> tmp/mean.c
echo "        sum += a[i];" >> tmp/mean.c
echo "    }" >> tmp/mean.c
echo "    printf(\"Mean is %f\", (float)sum / n);" >> tmp/mean.c
echo "    return 0;" >> tmp/mean.c
echo "}" >> tmp/mean.c

echo "#include <stdio.h>" >> tmp/median.c
echo "#include <math.h>" >> tmp/median.c
echo "int main()" >> tmp/median.c
echo "{" >> tmp/median.c
echo "    int i;" >> tmp/median.c
echo "    int n;" >> tmp/median.c
echo "    printf(\"Enter the number of elements in the array: \");" >> tmp/median.c
echo "    scanf(\"%d\", &n);" >> tmp/median.c
echo "    int a[n];" >> tmp/median.c
echo "    printf(\"Enter the elements of the array: \");" >> tmp/median.c
echo "    for (i = 0; i < n; i++)" >> tmp/median.c
echo "    {" >> tmp/median.c
echo "        scanf(\"%d\", &a[i]);" >> tmp/median.c
echo "    }" >> tmp/median.c
echo "    int median = 0;" >> tmp/median.c
echo "    if (n % 2 == 0)" >> tmp/median.c
echo "    {" >> tmp/median.c
echo "        median = (a[n / 2] + a[n / 2 - 1]) / 2;" >> tmp/median.c
echo "    }" >> tmp/median.c
echo "    else" >> tmp/median.c
echo "    {" >> tmp/median.c
echo "        median = a[n / 2];" >> tmp/median.c
echo "    }" >> tmp/median.c
echo "    printf(\"Median is %d\", median);" >> tmp/median.c
echo "    return 0;" >> tmp/median.c
echo "}" >> tmp/median.c

echo "#include <stdio.h>" >> tmp/stddev.c
echo "#include <math.h>" >> tmp/stddev.c
echo 
echo "int main()" >> tmp/stddev.c
echo "{" >> tmp/stddev.c
echo "    int i;" >> tmp/stddev.c
echo "    int n;" >> tmp/stddev.c
echo "    printf(\"Enter the number of elements in the array: \");" >> tmp/stddev.c
echo "    scanf(\"%d\", &n);" >> tmp/stddev.c
echo "    int a[n];" >> tmp/stddev.c
echo "    printf(\"Enter the elements of the array: \");" >> tmp/stddev.c
echo "    for (i = 0; i < n; i++)" >> tmp/stddev.c
echo "    {" >> tmp/stddev.c
echo "        scanf(\"%d\", &a[i]);" >> tmp/stddev.c
echo "    }" >> tmp/stddev.c
echo "    int sum = 0;" >> tmp/stddev.c
echo "    for (i = 0; i < n; i++)" >> tmp/stddev.c
echo "    {" >> tmp/stddev.c
echo "        sum += a[i];" >> tmp/stddev.c
echo "    }" >> tmp/stddev.c
echo "    int mean = sum / n;" >> tmp/stddev.c
echo "    int sum2 = 0;" >> tmp/stddev.c
echo "    for (i = 0; i < n; i++)" >> tmp/stddev.c
echo "    {" >> tmp/stddev.c
echo "        sum2 += (a[i] - mean) * (a[i] - mean);" >> tmp/stddev.c
echo "    }" >> tmp/stddev.c
echo "    int stddev = sqrt(sum2 / n);" >> tmp/stddev.c
echo "    printf(\"Standard deviation is %d\", stddev);" >> tmp/stddev.c
echo "    return 0;" >> tmp/stddev.c
echo "}" >> tmp/stddev.c


echo "Choose the operation you want to perform:"
echo "1. Mean"
echo "2. Median"
echo "3. Standard Deviation"
echo "4. Exit"
read -p "Enter your choice: " choice

if [ $choice -eq 1 ]
then
    gcc tmp/mean.c -o tmp/mean
    ./tmp/mean
    rm -rf tmp
elif [ $choice -eq 2 ]
then
    gcc tmp/median.c -o tmp/median
    ./tmp/median
    rm -rf tmp
elif [ $choice -eq 3 ]
then
    gcc tmp/stddev.c -o tmp/stddev -lm
    ./tmp/stddev
    rm -rf tmp
elif [ $choice -eq 4 ]
then 
    rm -rf tmp
    sudo reboot
else
    echo "Invalid choice!"
fi


















































# ==========================================================================================================







# read -p "Enter the number of elements in the array: " n
# echo "Enter the elements of the array: "
# for (( i=0; i<$n; i++ ))
# do
#     read a[$i]
# done

# echo "Mean is: "
# sum=0
# for (( i=0; i<$n; i++ ))
# do
#     sum=`expr $sum + ${a[$i]}`
# done
# mean=`expr $sum / $n`
# echo $mean

# echo "Median is: "
# if [ $n -eq 1 ]
# then
#     echo ${a[0]}
# else
#     if [ $n -eq 2 ]
#     then
#         echo `expr ${a[0]} + ${a[1]} / 2`
#     else
#         if [ `expr $n % 2` -eq 0 ]
#         then
#             echo `expr ${a[`expr $n / 2`]} + ${a[`expr $n / 2 - 1`]} / 2`
#         else
#             echo ${a[`expr $n / 2`]}
#         fi
#     fi
# fi

# echo "Standard deviation is: "
# sum=0
# for (( i=0; i<$n; i++ ))
# do
#     sum=`expr $sum + \( \( ${a[$i]} - $mean } \) \* \( ${a[$i]} - $mean \)`
# done
# stdDev=`expr $sum / $n`
# echo `expr sqrt $stdDev`
