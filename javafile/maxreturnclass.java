//wap to return the value which is max using class.

public class maxreturnclass
{
    int max(int a,int b,int c)
    {
        if(a>=b && a>=c)
        {
            return a;
        }
        else if(b>=a && b>=c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static void main(String arg[])
    {
        maxreturnclass obj=new maxreturnclass();
        System.out.println(obj.max(15,30,25));
    }
}