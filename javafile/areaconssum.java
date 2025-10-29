public class areaconssum
{
    areaconssum(int x,int y)
    {
        System.out.println("sum="+(x+y));
    }
    areaconssum(float a,float b)
    {
        System.out.println("sum="+(a+b));
    }
    areaconssum(double p,double q)
    {
        System.out.println("sum="+(p+q));
    }
    public static void main(String arg[])
    {
        areaconssum obj=new areaconssum(5,6);
        areaconssum obj1=new areaconssum(2.3f,4.5f);
        areaconssum obj2=new areaconssum(23.45,45.7);
    }
}