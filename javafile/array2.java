//find out 2nd largest element in an array

public class array2
{
    public static void main(String arg[])
    {
        int arr[]={10,20,40,30,60};
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
            else if(arr[i]>secondlarge)
            {
                secondlarge=arr[i];
            }
        }
        System.out.println(secondlarge);
    }
}