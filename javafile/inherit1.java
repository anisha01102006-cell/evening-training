class parent
{
    public 
    int x=2;
}
class child extends parent
{
    void dis()
    {
        System.out.println("square of number is: " + x*x);
    }
}
public class inherit1
{
    public static void main(String arg[])
    {
        child obj=new child();
        obj.dis();
    }
}