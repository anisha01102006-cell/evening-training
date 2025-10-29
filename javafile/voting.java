import java.util.Scanner;
public class voting
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("READY FOR VOTE");
        }
        else
        {
            System.out.println("NOT ELIGIBLE FOR VOTE");
        }
    
        
    }
}