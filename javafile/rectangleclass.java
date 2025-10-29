//wap to find area of rectangle using object return type

public class rectangleclass
{
    int rectangle(int l,int b)
    {
        return l*b;
    }
    public static void main(String arg[])
    {
        rectangleclass obj=new rectangleclass();
        System.out.println("Area of rectangle: "+obj.rectangle(4,6));
    }
}