package playground.concurrency;

public class Concurrent {


    public static void main(String args[])
    {
       SynchronizedExchanger se = new SynchronizedExchanger();

        Runnable setter = new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<100;i++) {
                    System.out.println("Setter called");
                    se.setObj(i);
                }
            }
        };

        Runnable getter = new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<100;i++) {
                    System.out.println("Getter called");
                    System.out.println(se.getObject());
                }
            }
        };

        //It is not fixed when a certain thread gets access to the processor
        //They are time sliced, both don't work at the same time, they get intervals at which each get access.
        Thread t = new Thread(setter);
        t.start();
        Thread t2 = new Thread(getter);
        t2.start();
        //Do not confuse this with only one thread running at a time, they are time sliced, but also they might access different
        //parts of the program, and at a time you may have multiple threads active, which are in the middle of their execution cycles
        //https://stackoverflow.com/questions/1085709/what-does-synchronized-mean
    }
}
