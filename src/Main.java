
class  UserThread extends Thread
{
    public  void run()
    {
        System.out.println("this is user defined thread.");
    }
}
 class ThreadOp
 {
    public static void main(String[] args)
    {
        System.out.println("Program started...");
        int x=56+34;
        System.out.println("sum is :"+x);

        Thread t=Thread.currentThread();


        String tname=t.getName();
        System.out.println("current running thread is :"+tname);
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e){}

        System.out.println("Id of Thread is : "+t.getId());



        t.setName("MyThr");
        System.out.println("MyThr");

        UserThread thread = new UserThread();
        thread.start();

        System.out.println("program ended..");

    }
}