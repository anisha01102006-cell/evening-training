import java.util.Scanner;
public class FeastArrangement
{
    public static void main(String arg[])
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("WE ARE ARRANGING A FEAST");
        System.out.println("select menu: 1.veg 2.non-veg");
        System.out.println("enter your choice: ");
        choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("veg feast menu");
            System.out.println("Rice,Paneer chilli,Masrum curry,Carbage pokoda,Dal fry,Butter masala,Gulab jamun");
        }
        else if(choice==2)
        {
            System.out.println("non-veg feast menu");
            System.out.println("Rice,Chicken curry,Biyani,Fish fry,Motton gravy,Chilli chicken,Chicken pokoda");
        }
        else
        {
            System.out.println("WRONG CHOICES ! PLEASE SELECT VEG OR NON-VEG ITEM");
        }

    }
}