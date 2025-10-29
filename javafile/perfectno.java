public class perfectno
{
    public static void main(String arg[])
    {
        int n=28;
        int m=n;
        int sum=0;
        for(int i=1;i<m;i++)
        {
            if(m%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==m)
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("not perfect");
        }
    }
}