package playground.threads;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("From runnable implemented class");
    }
}
