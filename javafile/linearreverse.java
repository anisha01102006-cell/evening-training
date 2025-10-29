public class linearreverse
{
    public static void main(String arg[])
    {
        int[] arr={1,2,3,4,5};
        int length=arr.length;
        System.out.println("Traversal");
        int sum=0;
        for(int i=length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println("sum="+sum);  
    }
}
