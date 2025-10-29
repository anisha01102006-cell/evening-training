import java.util.scanner;
public class Customer
{
    public static void main(String arg[])
    {
        string name,product;
        Scanner sc=new Scanner(system.in);
        System.out.println("enter the customer name,product name");
        name=sc.next();
        product=sc.next();
        System.out.println("enter quantity");
        int qty=sc.nextInt();
        System.out.println("enter price per item");
        double price=sc.nextDouble();
        double total=qty*price;
        System.out.println("customer:"+name);
        System.out.println("product:"+product);
        System.out.println("total price:"+total);
    }
}