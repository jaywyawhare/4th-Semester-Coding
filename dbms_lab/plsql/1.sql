-- Write a PLSQL program to display Largest among 3 numbers.

Declare
        P1 Integer;
        P2 Integer;
        P3 Integer;

-- find largest 
Begin
        P1 := &P1;
        P2 := &P2;
        P3 := &P3;
        DBMS_OUTPUT.PUT_LINE(P1);
        DBMS_OUTPUT.PUT_LINE(P2);
        DBMS_OUTPUT.PUT_LINE(P3);
        DBMS_OUTPUT.PUT_LINE(max(P1, P2, P3));
End;
