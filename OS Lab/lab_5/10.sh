# 1
# 12
# 123
# 1234
# 12345
# Pattern print

#!/bin/bash
read -p "Enter the number of elements in a line: " num
for (( i=1; i<=num; i++ ))
do
    for (( j=1; j<=i; j++ ))
    do
        echo -n "$j "
    done
    echo
done
