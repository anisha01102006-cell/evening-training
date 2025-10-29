public class leftright
{
    public static void main(String arg[])
    {
        int arr[]={100,50,300,400,500};
        int length=arr.length;
        int left=0;
        int right=length-1;
        int temp;
        while(left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}