public class arraycount
{
    public static void main(String arg[])
    {
        int arr[]={5,6,7,5,10,11,5,5,9,6,2};
        int length=arr.length;
        int count=0;
        int key=5;
        for(int i=0;i<length;i++)
        {
            if(key==arr[i])
            {
                count++;
            }
        }
        System.out.println("my key value is " + count + " times appear");
    }
}