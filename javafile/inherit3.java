import java.util.Scanner;
class parent
{
    int x,y;
    Scanner sc=new Scanner(System.in);
}
class child extends parent
{
    void show()
    {
        System.out.println("enter value for x:");
        x=sc.nextInt();
        System.out.println("enter value for y:");
        y=sc.nextInt();
        int sum=x+y;
        int avg=sum/2;
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
    }
}
public class inherit3
{
    public static void main(String arg[])
    {
        child obj=new child();
        obj.show();
    }
}