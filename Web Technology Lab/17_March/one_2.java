// A subclass „kiitian‟ with course() method implementation

import java.util.*;
public class kiitian extends student
{
    public kiitian(int rollno, String regno)
    {
        super(rollno, regno);
    }
    public void course()
    {
        System.out.println("Course: B.Tech");
    }
}
public static void one_2 (String[] args)
{
    kiitian s = new kiitian(1, "A");
    s.course();
}