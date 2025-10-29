public class searching
{
    public static void main(String arg[])
    {
        int arr[]={10,5,9,8,7,6};
        int length=arr.length;
        int flag=0;
        int key=8;
        for(int i=0;i<length;i++)
        {
            if(key==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("elements are found");
        }
        else 
        {
            System.out.println("elements are not found");
        }
    }
}