//WAP TO EXECUTE A THREAD AND KNOW THE PRIORITY OF THE THREAD 

class mythread4 extends Thread 
{
    public void run()
    {
        System.out.println("Anisha");
    }
    public static void main(String arg[])
    {
        mythread4 t1=new mythread4();
        t1.start();
        System.out.println(t1.getPriority());
    }
}