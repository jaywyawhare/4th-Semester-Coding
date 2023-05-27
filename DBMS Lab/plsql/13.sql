-- Write a PLSQL program to display multiplication table up to 10 for a given number.

Declare
        n Integer;
        i Integer;
        
Begin
        n := &n;
        for i in 0..11 loop
                DBMS_OUTPUT.PUT_LINE(i * n);
        end loop;
End;