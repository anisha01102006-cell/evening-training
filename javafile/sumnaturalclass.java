//wap using for each loop to show sum of natural numbers using class.

public class sumnaturalclass
{
    void sumnumbers()
    {
    int numbers[]={1,2,3,4,5,6,7,8,9,10};
    int sum=0;
    for(int n:numbers)
    {
        sum=sum+n;
    }
    System.out.println("sum="+sum);
    }
    public static void main(String arg[])
    {
        sumnaturalclass obj=new sumnaturalclass();
        obj.sumnumbers();
    }
}