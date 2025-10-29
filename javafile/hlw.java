import java.util.Scanner;
public class hlw
{
    public static void main(String arg[])
    {
        double d1,d2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter d1 & d2");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
        int x=(int)d1;
        int y=(int)d2;
        int sum=x+y;
        int square=sum*sum;
        System.out.println("sum="+sum);
        System.out.println("square of sum="+square);
    }
}