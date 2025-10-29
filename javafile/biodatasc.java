
import java.util.Scanner;
public class biodatasc
{
    public static void main(String arg[])
    {
        String name,dob,branch;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        name=sc.next();
        System.out.println("enter your age");
        age=sc.nextInt();
        System.out.println("enter your dob");
        dob=sc.next();
        System.out.println("enter your branch");
        branch=sc.next();
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("dob="+dob);
        System.out.println("branch="+branch);


    }
}