public class allareafunction
{
    void circle(double r)
    {
        double area=3.14*r*r;
        System.out.println("area of the circle="+area);
    }
    void rectangle(double l,double b)
    {
        double area=l*b;
        System.out.println("area of the rectangle="+area);
    }
    void square(double a)
    {
        double area=a*a;
        System.out.println("area of the square="+area);
    }
    public static void main(String arg[])
    {
        allareafunction obj=new allareafunction();
        obj.circle(5);
        obj.rectangle(4,6);
        obj.square(3);
    }
}