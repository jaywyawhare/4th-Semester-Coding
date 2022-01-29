#!/bin/bash

read -p "Enter the term: " word

#fuzzy search 
find / -type f -iname "*$word*" 2> /dev/null | xargs grep -l $word

#save console output in a file
find / -type f -iname "*$word*" 2> /dev/null | xargs grep -l $word > $word.txt


exit 0

