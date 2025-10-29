//sum of prime digits

public class sumofodd
{
    public static void main(String arg[])
    {
        int n=3457;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            if(d==2||d==3||d==5||d==7)
            {
                sum=sum+d;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}