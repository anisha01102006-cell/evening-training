//find out the third largest element

public class array4
{
    public static void main(String arg[])
    {
        int arr[]={10,20,40,60,30,60,60};
        int length=arr.length;
        int thirdlarge=-1;
        int secondlarge=-1;
        int firstlarge=-1;
        for(int i=0;i<length;i++)
        {
            if(arr[i]>firstlarge)
            {
                thirdlarge=secondlarge;
                secondlarge=firstlarge;
                firstlarge=arr[i];
            }
            else if(arr[i]>secondlarge && arr[i]!=firstlarge && arr[i]!=thirdlarge) 
            {
                thirdlarge=secondlarge;
                secondlarge=arr[i];
            }
            else if(arr[i]>thirdlarge && arr[i]!=secondlarge && arr[i]!=thirdlarge)
            {
                thirdlarge=arr[i];
            }
        }
        System.out.println(thirdlarge);
    }
}