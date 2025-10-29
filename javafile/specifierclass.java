//wap using different access specifier

public class specifierclass
{
    public int a=10;      //public
    private int b=20;     //private
    protected int c=30;   //protected
    int d=40;
    void show()
    {
        System.out.println("public: "+a);
        System.out.println("private: "+b);
        System.out.println("protected: "+c);
        System.out.println("default: "+d);
    }
    public static void main(String arg[])
    {
        specifierclass obj=new specifierclass();
        obj.show();
    }
}
