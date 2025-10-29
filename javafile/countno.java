//count number of digits

public class countno
{
    public static void main(String arg[])
    {
        int n=500;
        int count=0;
        while(n>0)
        {
            count=count+1;
            n=n/10;
        }
        System.out.println(count);
    }
}