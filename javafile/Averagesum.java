public class Averagesum
{
public static void main(String arg[])
{
int a,b,c,d,e;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);
d=Integer.parseInt(arg[3]);
e=Integer.parseInt(arg[4]);
int sum=(a+b+c+d+e);
int avg=sum/5;
System.out.println("sum="+sum);
System.out.println("avg="+avg);
}
}