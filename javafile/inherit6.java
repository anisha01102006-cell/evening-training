class parent
{
    parent()
    {
        System.out.println("this is super class constructor");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("this is sub class constructor");
    }
}
public class inherit6
{
    public static void main(String arg[])
    {
        child obj=new child();
    }
}