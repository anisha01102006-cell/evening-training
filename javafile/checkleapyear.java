//check leapyear

public class checkleapyear
{
    public static void main(String arg[])
    {
        int year=2025;
        if((year%400==0)||(year%4==0 && year%100!=0))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}