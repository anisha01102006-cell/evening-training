import java.util.Scanner;
public class btechadmission
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your entrance exam rank: ");
        int rank=sc.nextInt();

        if(rank<=500)
        {
            System.out.println("congratulation!you got admission in government college");
        }
        else
        {
            System.out.println("you got admission in private college");
        }
    }
}