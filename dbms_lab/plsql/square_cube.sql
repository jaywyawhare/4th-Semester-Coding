#Find square and cube of a number in plsql

Declare
    num number;
    sqr number;
    cube number;
Begin
    num := &num;
    sqr := num * num;
    cube := num * num * num;
    dbms_output.put_line(sqr);
    dbms_output.put_line(cube);
End;