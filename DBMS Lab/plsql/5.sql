-- Write a PLSQL program to check the amount entered in rupees is multiples of hundred or not.

Declare
    l_amt number;
    l_amt_str varchar2(50);
Begin
    l_amt_str := '1000';
    l_amt := to_number(l_amt_str);
    if l_amt % 100 = 0 then
        dbms_output.put_line('Amount is multiples of hundred');
    else
        dbms_output.put_line('Amount is not multiples of hundred');
End;