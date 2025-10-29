//WAP TO PRINT SUM OF ALL EVEN NUMBER FROM 1 TO N.

import java.util.Scanner;
public class sumevenprint
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for n: ");
        n=sc.nextInt();
        int i=1,sum=0;
        System.out.println("the number is even");
        while(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum="+sum);
    }
}