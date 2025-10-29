//WAP TO PRINT 3 MULTIPLICATION TABLE USING FOR LOOP.
//3*1=3
//3*2=6

import java.util.Scanner;
public class multiloop
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=1;
        for(i=1;i<=n;i++)
        {
            System.out.println("n="+(n*i));
        }
    }
}