import java.util.Scanner;  
public class armstrong
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n:");
        n=sc.nextInt();
        int digit=0;
        int sum=0;
        int t=n;
        while(t!=0)
        {
            t=t/10;
            digit++;
        }
        System.out.println("no of digit="+digit);
        t=n;
        while(t!=0)
        {
            int r=t%10;
            sum=sum+(int)Math.pow(r,digit);
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println("the number is armstrong");
        }
        else
        {
            System.out.println("the number is armstrong");
        }
        

    }
}