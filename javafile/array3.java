public class array3
{
    public static void main(String arg[])
    {
        int arr[]={10,60,40,30,60,20};
        int length=arr.length;
        int secondlarge=-1;
        int firstlarge=-1;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>firstlarge)
            {
                secondlarge=firstlarge;
                firstlarge=arr[i];
            }
            else if(arr[i]>secondlarge && arr[i]!=firstlarge) //either we can write else if(secondlarge==arr[i])
            {
                secondlarge=arr[i];
            }
        }
        System.out.println(secondlarge);
    }
}