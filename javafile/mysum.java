//WAP TO PRINT SUM OF NATURAL NO BETWEEN 1 TO N

import java.util.Scanner;
public class mysum
{
    public static void main(String arg[])
    {
        int n,i=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        n=sc.nextInt();
        while(i<=n)
        {
            sum=sum+i;
            System.out.println("sum="+sum);
            i++;
        }
    }
}