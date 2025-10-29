import java.util.Scanner;
public class positivenegative
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        if(n>0)
        {
            System.out.println("the number is positive");
        }

        else if(n<0)
        {
            System.out.println("the number is negative");
        }

        else
        {
            System.out.println("the number is zero");
        }
    

    }
}