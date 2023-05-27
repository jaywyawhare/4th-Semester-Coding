# A
# AB
# ABC
# ABCD
# ABCDE
# Pattern print

#!/bin/bash
for f in {A..E}
do
    for i in $(eval echo "{A..$f}")
    do
        echo -n "$i"
    done
    echo
done