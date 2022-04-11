-- Write a PLSQL program to display the sum of every digit of a given number.

Declare
        n Integer;
        i Integer;
        sum Integer;
        temp Integer;
        flag Integer;
Begin
        n := &n;
        sum := 0;
        temp := n;
        flag := 0;
        while temp > 0 do
                i := temp % 10;
                sum := sum + i;
                temp := temp / 10;
        end loop;
        DBMS_OUTPUT.PUT_LINE(sum);
End;