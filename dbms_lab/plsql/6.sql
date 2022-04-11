-- Write a PLSQL program to display smallest among 4 numbers.

Declare
        P1 Integer;
        P2 Integer;
        P3 Integer;
        P4 Integer;

Begin
        P1 := &P1;
        P2 := &P2;
        P3 := &P3;
        P4 := &P4;
        DBMS_OUTPUT.PUT_LINE(P1);
        DBMS_OUTPUT.PUT_LINE(P2);
        DBMS_OUTPUT.PUT_LINE(P3);
        DBMS_OUTPUT.PUT_LINE(P4);
        DBMS_OUTPUT.PUT_LINE(min(P1, P2, P3, P4));
