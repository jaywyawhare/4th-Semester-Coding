-- Write a PLSQL program to display the product of 2 numbers without multiplication.

Declare
        P1 Integer;
        P2 Integer;
        ans Integer;
        i Integer;

Begin
        P1 := &P1;
        P2 := &P2;
        for i in 0..P2 loop
                ans := ans + P1;
        end loop;
        DBMS_OUTPUT.PUT_LINE(ans);
        
End;        