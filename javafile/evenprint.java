import java.util.Scanner;
public class evenprint
{
    public static void main(String arg[])    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for n: ");
        n=sc.nextInt();
        int i=1;
        System.out.println("the no is even");
        while(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}