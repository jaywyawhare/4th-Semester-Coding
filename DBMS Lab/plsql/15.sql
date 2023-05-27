-- Write a PLSQL program to check the given number is Palindrome or not.

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
                sum := sum * 10 + i;
                temp := temp / 10;
        end loop;
        if sum = n then
                DBMS_OUTPUT.PUT_LINE('Palindrome');
        else
                DBMS_OUTPUT.PUT_LINE('Not Palindrome');
        end if;
        
End;