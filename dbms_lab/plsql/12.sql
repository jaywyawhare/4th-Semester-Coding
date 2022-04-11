-- Write a PLSQL program to display all the odd numbers within a given range.

Declare
        Upper Integer;
        i Integer;
Begin
        Upper := &Upper;
        for i in 0..Upper loop
                if i mod 2 = 1 then
                        DBMS_OUTPUT.PUT_LINE(i);
                end if;
        end loop;
End;