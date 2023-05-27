-- Write a PLSQL program to sum of all the numbers from 1 to n.

Declare
        n Integer;
        sum Integer;
        i Integer;

Begin
        n := &n;
        sum := 0;
        for i in (select * from emp) loop
                sum := sum + i.sal;
        end loop;
        DBMS_OUTPUT.PUT_LINE(sum);
End;