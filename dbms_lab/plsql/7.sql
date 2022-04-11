-- Write a PLSQL program to check the entered number is Prime number or not.

Declare
        P1 Integer;
        
Begin
        P1 := &P1;
        if P1 = 1 then
                DBMS_OUTPUT.PUT_LINE('Not Prime');
        else
                for i in 2..P1/2 loop
                        if P1 % i = 0 then
                                DBMS_OUTPUT.PUT_LINE('Not Prime');
                                exit;
                        end if;
                end loop;
                DBMS_OUTPUT.PUT_LINE('Prime');
        end if;
End;