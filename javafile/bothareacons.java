public class bothareacons
{
    bothareacons(double r)
    {
        System.out.println("area of the circle: "+3.14*r*r);
    }
    bothareacons(int l,int b)
    {
        System.out.println("area of the rectangle: "+l*b);
    }
    bothareacons(float b,float h)
    {
        System.out.println("area of the circle: "+0.5*b*h);
    }
    public static void main(String arg[])
    {
        bothareacons obj=new bothareacons(20.12);
        bothareacons obj1=new bothareacons(12,5);
        bothareacons obj2=new bothareacons(2.5f,5.4f);
    }
}