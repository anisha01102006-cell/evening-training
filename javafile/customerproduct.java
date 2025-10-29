import java.util.Scanner;
public class customerproduct
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("available products are: 1.LAPTOP 2.MOBILE 3.HEADPHONES");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("you selected laptop");
            System.out.println("features:I5 processor,8GB RAM,512 GB SSD");
        }
        else if(choice==2)
        {
            System.out.println("you selected mobile");
            System.out.println("features:Android,5G,1080 MP rear camera");
        }
        else if(choice==3)
        {
            System.out.println("you selected headphones");
            System.out.println("features:wireless,noise cancellation,good sound quality");
        }
        else
        {
            System.out.println("wrong choices");
        }

    }
}