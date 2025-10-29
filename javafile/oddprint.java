//WAP TO PRINT ALL THE ODD NUMBERS FROM 1 TO 100.

import java.util.Scanner;
public class oddprint
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for n: ");
        n=sc.nextInt();
        int i=1;
        System.out.println("the number is odd");
        while(i<=n)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}