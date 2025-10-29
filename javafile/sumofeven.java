//sum of even digits

public class sumofeven
{
    public static void main(String arg[])
    {
        int n=68;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            if(d%2==0)
            {
                sum=sum+d;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}