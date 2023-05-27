-- Write a PLSQL program to display the average number of records of any database table.

Declare
        ave Integer;
        cnt Integer;
        i Integer;

Begin
        cnt := 0;
        for i in (select * from emp) loop
                cnt := cnt + 1;
        end loop;
        ave := cnt / (select count(*) from emp);
        DBMS_OUTPUT.PUT_LINE(ave);
End;