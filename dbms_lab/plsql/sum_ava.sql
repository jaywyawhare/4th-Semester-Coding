#find sum and avarage of 5 numbers 
#answer in plsql


Declare 
        P1 NUMBER;
        P2 NUMBER;
        P3 NUMBER;
        P4 NUMBER;
        P5 NUMBER;
        S NUMBER;
        A NUMBER;

Begin 
        P1 := &P1;
        P2 := &P2;
        P3 := &P3;
        P4 := &P4;
        P5 := &P5;
        S := P1 + P2 + P3 + P4 + P5;
        A := S / 5;
        DBMS_OUTPUT.PUT_LINE(S);
        DBMS_OUTPUT.PUT_LINE(A);
End;
