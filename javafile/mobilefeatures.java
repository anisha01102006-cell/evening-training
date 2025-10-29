import java.util.Scanner;
public class mobilefeatures
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile price: ");
        int price=sc.nextInt();

        if(price>200000)
        {
            System.out.println("mobile company:SAMSUNG");
            System.out.println("features:AMOLED 2X DISPLAY,5G,ADVANCED AI-POWERED,HIGH PICTURE QUALITY");
        }
        else if(price<200000 && price>20000)
        {
            System.out.println("mobile company:REDMI");
            System.out.println("features:ANDROID,SNAPDRAGON 4 GEN 2 PROCESSOR,5G,MEDIUM PICTURE QUALITY");
        }
        else
        {
            System.out.println("mobile company:other brand");
            System.out.println("features:LOW PICTURE QUALITY,4G,BASIC DESIGN");
        }
    }
}