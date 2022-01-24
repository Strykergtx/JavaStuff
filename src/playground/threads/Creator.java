package playground.threads;

public class Creator {

    public void createThread()
    {
        Runnable r = new Runnable()
        {
            public void run()
            {
                System.out.println("Thread created");
            }
        };

        Thread t =  new Thread(r);
        t.start();
    }

    public void createThread2()
    {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread created");
            }
        });
        t.start();
    }

}
