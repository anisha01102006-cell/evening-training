import java.util.Scanner;
public class automorphic
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sqare=n*n;
        int digits=String.valueof(n).length();
        int lastdigits=sqare%(int)Math.pow(10,digits);
        if(lastdigits==n)
        {
            System.out.println(n+"is an Automorphic no");
        }
        else
        {
            System.out.println(n+"is not an automorphic no");
        }   
    }
}