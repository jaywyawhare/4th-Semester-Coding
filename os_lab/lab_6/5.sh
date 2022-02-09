# WAP to display the array elements in descending order.

#!/bin/bash
IFS=' ' read -ra arr -p "Enter numbers: "


sort -nr <(printf "%s\n" "${arr[@]}")
