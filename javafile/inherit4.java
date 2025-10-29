class parent
{
    void show()
    {
        System.out.println("i am in parent class");
    }
}
class child extends parent
{
    void dis()
    {
        show();
        System.out.println("i am in child class");
    }
}
public class inherit4
{
    public static void main(String arg[])
    {
        child obj=new child();
        obj.dis();
    }
}