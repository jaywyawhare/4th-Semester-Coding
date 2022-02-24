#WAP to display the array elements in ascending order.


#!/bin/bash

IFS=' ' read -ra arr -p "Enter numbers: "

sort -n <(printf "%s\n" "${arr[@]}")
