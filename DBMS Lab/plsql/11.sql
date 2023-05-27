-- Write a PLSQL program to accept the name of a student and display it in Upper case and
-- Lowercase.

Declare
        name String;
Begin
        name := &name;
        DBMS_OUTPUT.PUT_LINE(name);
        DBMS_OUTPUT.PUT_LINE(upper(name));
        DBMS_OUTPUT.PUT_LINE(lower(name));
End;