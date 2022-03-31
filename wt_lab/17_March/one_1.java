// An abstract class „student‟ with data member roll no, reg no and a abstract method course()

import java.util.*;
public abstract class student
{
    int rollno;
    String regno;
    public student(int rollno, String regno)
    {
        this.rollno = rollno;
        this.regno = regno;
    }
    public abstract void course();
}

public static one_1 (String[] args)
{
    student s = new student(1, "A");
    s.course();
}
