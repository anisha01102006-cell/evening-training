//simple interest

public class compound
{
    public static void main(String arg[])
    {
        int P=1800,T=2,R=20;
        int CI=P*((1+R/100)^T)-P;
        System.out.println(CI);
    }
}