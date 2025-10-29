public class amonglargest
{
    public static void main(String arg[])
    {
        int[] arr={10,5,30,40,50};
        int large=arr[0];
        int length=arr.length;
        for(int i=1;i<length;i++)
        {
            if(large<arr[i])
            {
                large=arr[i];  
            }
        }
        System.out.println(large);
    }
}