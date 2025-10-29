import java.util.Scanner;
public class atmprocess
{
    public static void main(String arg[])
    {
        double amount,balance=10000;
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("\nyour choices are\n 1.withdraw\n 2.deposit\n");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("Enter the amount for withdraw: ");
            amount=sc.nextDouble();

            if(amount<=balance)
            {
                balance-=amount;
                System.out.println("withdrawal successfull");
                System.out.println("remaining balance:"+balance);
            }
            else
            {
                System.out.println("insufficient balance");
            }    
        }
        else if(choice==2)
        {
            System.out.println("Enter value for deposite:");
            amount=sc.nextDouble();
            balance+=amount;
            System.out.println("deposite successful");
            System.out.println("updated balance");
        }
        else
        {
            System.out.println("invalid choice");
        }
    }
}            