# a to power b

#!/bin/bash

read -p "Enter a number: " a
read -p "Enter another number: " b

echo "The value of a to the power of b is: "
echo $((a**b))

