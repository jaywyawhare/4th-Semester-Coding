-- if age is greater than 18 and you are M then you can vote plsql

Declare
    age number;
    gender number;

Begin
    age := &age;
    dbms_output.put_line('Gender = 0 for woman and 1 for man');
    gender := &gender;
    if gender=1 then
        if age > 18 then
           dbms_output.put_line('You can Vote');
        end if
    else
        dbms_output.put_line('You can not Vote, thore bade ho jao fir vote karna');
    end if;
