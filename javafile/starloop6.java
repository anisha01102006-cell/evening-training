public class starloop6
{
    public static void main(String arg[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    