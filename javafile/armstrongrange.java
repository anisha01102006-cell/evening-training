


public class armstrongrange
{
    public static void main(String arg[])
    {
        System.out.println("Armstrong number from 1 to 1000");
        for(int num=1;num<=1000;num++)
        {
            int temp=num;
            int sum=0;
            int digits=0;
            int n=temp;
            while(n>0)
            {
                digits++;
                n=n/10;
            }
            n=temp;
            while(n>0)
            {
                int digit=n%10;
                sum = sum+(int)Math.pow(digit,digits);
                n=n/10;
            }
            if(sum==num)
            System.out.println(num);
        }
    }
}