//WAP TO FIND THE SUM AND AVG OF N NATURAL NUMBER.

import java.util.Scanner;
public class sumavgofN
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=1,sum=0;
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        float avg=(float)sum/n;
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
    }
}