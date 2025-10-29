public class amongsmallest
{
    public static void main(String arg[])
    {
        int[] arr={10,5,30,40,50};
        int small=arr[0];
        int length=arr.length;
        for(int i=1;i<length;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];  
            }
        }
        System.out.println(small);
    }
}