package playground.threads;

public class ThreadExample extends  Thread{
    @Override
    public void run()
    {
        System.out.println("From thread extended class");
    }
}
