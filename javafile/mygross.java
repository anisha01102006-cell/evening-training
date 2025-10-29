//WAP TO CREATE EMPLOYEE CLASS WHICH CONTAINS TWO MEMBER OF YOUR UID AND PWD AND ACCESS IT BY USING INSIDE AND OUTSIDE CLASS

import java.util.Scanner;
class employee
{
    private String name;
    private int id;
    private double basicsalary;
    private double hra;
    private double da;
    private double grosssalary;
    void grosssal()
    {
        grosssalary=basicsalary+hra+da;
    }
    void display()
    {
        System.out.println("name: "+name);
        System.out.println("id: "+id);
        System.out.println("basicsalary: "+basicsalary);
        System.out.println("hra: "+hra);
        System.out.println("da: "+da);
        System.out.println("grosssalary: "+grosssalary);
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee name: ");
        name=sc.next();
        System.out.println("enter employee id: ");
        id=sc.nextInt();
        System.out.println("enter employee basicsalary: ");
        basicsalary=sc.nextDouble();
        System.out.println("enter employee hra: ");
        hra=sc.nextDouble();
        System.out.println("enter employee da: ");
        da=sc.nextDouble();
    }
}

public class mygross
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        employee emp=new employee();
        emp.input();
        emp.grosssal();
        emp.display(); 
    }
}