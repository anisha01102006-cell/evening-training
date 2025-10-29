class parent
{
    public
    int y=2;
    private
    int x=4;
    protected
    int z=5;

    public 
    void s()
    {
        System.out.println(x);
    }
}
class child extends parent
{
    void show()
    {
        s();
        System.out.println(y);
        System.out.println(z);
    }
}    
public class inherit2
{
    public static void main(String arg[])
    {
        child obj=new child();
        obj.show();
    }
}
   