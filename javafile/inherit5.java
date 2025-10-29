class A 
{
    int x=2;
}
class B extends A 
{
    int y=5;
}
class C extends B
{
    int z=9;
    void sum()
    {
        System.out.println(x+y+z);
    }
}
public class inherit5
{
    public static void main(String arg[])
    {
        C obj=new C();
        obj.sum();
    }
}