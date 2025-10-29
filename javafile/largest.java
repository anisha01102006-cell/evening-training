//find largest among 3 number

public class largest
{
    public static void main(String arg[])
    {
        int a=10,b=20,c=30;

        if(a>=b && a>=c)
        {
            System.out.println(a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}