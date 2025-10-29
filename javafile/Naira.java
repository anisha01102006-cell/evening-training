import java.util.Scanner;
public class naira
{
    public static void main(String arg[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("addition="+(a+b));
        System.out.println("substraction="+(a-b));
        System.out.println("multiplication="+(a*b));
        System.out.println("division="+(a/b));
        System.out.println("modulus="+(a%b));

    }
}