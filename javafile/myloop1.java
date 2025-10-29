//WAP TO PRINT NO FROM 1 TO 50 USING WHILE LOOP.

import java.util.Scanner;
public class myloop1
{
    public static void main(String arg[])
    {
        int i=1;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        while(i<=50)
        {
            System.out.println(i);
            i++;
        }
    }
}