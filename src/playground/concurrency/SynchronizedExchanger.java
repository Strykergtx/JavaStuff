package playground.concurrency;

public class SynchronizedExchanger {

   protected Object object = null;

   static int x =0;

   //only one thread can access these synchronized methods at a time
// Threads can access this method one at a time. Without synchronized all threads can access this method simultaneously.
   public synchronized void setObject(Object o)
   {
       this.object =o;
   }

    public synchronized Object getObject()
    {
       return this.object;
    }

    //this method is synchronized on this instance of SynchronizedExchanger
    //same as the synchronized setObject above
    public void setObj(Object o)
    {
        synchronized (this) //monitor object, single access(1 thread) to this Monitor object
        {
            this.object =o;
        }
    }

    //synchronized keyword also works inside static classes and methods
    public static void setObjStatic(int num)
    {
        synchronized (SynchronizedExchanger.class) //notice the change in monitor for static class
        {
            x = num;
        }
    }


}
