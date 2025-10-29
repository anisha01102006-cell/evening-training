//FIND GCD OR HCF OF 2 NUMBERS

public class gcdORhcf
{
    public static void main(String arg[])
    {
        int a=12,b=20;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}