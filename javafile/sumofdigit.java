//sum of digit

public class sumofdigit
{
    public static void main(String arg[])
    {
        int n=40;
        int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println(sum);
    }
}