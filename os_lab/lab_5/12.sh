# 12345
# 1234
# 123
# 12
# 1
# pattern print

#!/bin/bash
read -p "Enter the number of elements in a line: " num
for (( i=$num; i>=1; i-- ))
do
    for (( j=1; j<=i; j++ ))
    do
        echo -n "$j "
    done
    echo
done

