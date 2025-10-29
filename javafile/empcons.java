public class empcons
{
    int id;
    String name;
    double salary;

    empcons()
    {
        id=100;
        name="JANI";
        salary=70000;
    }
    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
        System.out.println("SALARY:"+salary);
    }
    public static void main(String arg[])
    {
        empcons obj=new empcons();
        obj.display();
    }
}