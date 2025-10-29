import java.util.Scanner;
public class GreatestNumber
{
    public static void main(String arg[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        a=sc.nextInt();
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("Greastest number is: "+a);
        }
        else if(b>a)
        {
            System.out.println("Greatest number is: "+b);
        }
        else
        {
            System.out.println("both numbers are equal.");
        }
    }
}