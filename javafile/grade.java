import java.util.Scanner;
public class grade
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for marks");
        int marks=sc.nextInt();

        if(marks>=90)
        {
            System.out.println("grade:O");
        }
        else if(marks>=80)
        {
            System.out.println("grade:E");
        }
        else if(marks>=70)
        {
            System.out.println("grade:A");
        }
        else if(marks>=60)
        {
            System.out.println("grade:B");
        }
        else if(marks>=50)
        {
            System.out.println("grade:C");
        }
        else if(marks>=40)
        {
            System.out.println("grade:D");
        }
        else
        {
            System.out.println("grade:fail");
        }
    }
}
       