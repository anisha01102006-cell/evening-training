public class program2
{
    public static void main(String arg[])
    {
        int arr[]={5,3,1,6,9,7,8};
        int length=arr.length;
        int profit=0;
        int min=arr[0];
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                profit=Math.max(profit,arr[j]-arr[i]);
            }
        }
        System.out.println("maximum profit="+profit);
    }    
}