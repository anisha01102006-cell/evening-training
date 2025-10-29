//sum of prime numbers in a range

public class primerange
{
    public static void main(String arg[])
    {
        int start=1;
        int range=30;
        int sum=0;
        for(int i=1;i<range;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                flag=1;
                break;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
        } 
        System.out.println(sum);
    }
}