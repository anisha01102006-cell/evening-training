//enen sum of fibonacci series till N

public class fibonacci
{
    public static void main(String arg[])
    {
        int a=0,b=1,sum=0;
        
        if(a%2==0)
        {
            sum=sum+a;
            int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(sum);

    }
} 