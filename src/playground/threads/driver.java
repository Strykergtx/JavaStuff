package playground.threads;

public class driver {

    public static void main(String args[])
    {
        Creator creator = new Creator();
        creator.createThread();
        creator.createThread2();
        ThreadExample thread = new ThreadExample();
        thread.start();
        RunnableExample run = new RunnableExample();
        Thread t = new Thread(run);
        t.start();

    }
}
