//display all prime numbers from 1 to N

public class primeno
{
    public static void main(String arg[])
    {
        int n=40;
        int i,j;
        for(i=2;i<=n;i++)
        {
            boolean flag=true;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                System.out.println(i);
            }
        }
    }
}