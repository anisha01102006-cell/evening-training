//WAP TO FIND THE AREA triangle USING OBJECT.

public class triangleAreaClass
{
    void triangle(double l,double b)
    {
        double area=l*b;
        System.out.println("area of the rectangle="+area);
    }
    public static void main(String arg[])
    {
        triangleAreaClass obj=new triangleAreaClass();
        System.out.println(obj.triangle(15,4));
    }
}