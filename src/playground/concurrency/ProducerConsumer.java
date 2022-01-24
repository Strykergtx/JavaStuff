package playground.concurrency;
import java.util.LinkedList;

public class ProducerConsumer {

    //THIS IS AN EXAMPLE OF PERFECT ALTERNATION BETWEEN PRODUCER AND CONSUMER ACHIEVED BY
    //WAIT() AND NOTIFY()
        public static void main(String[] args)
                throws InterruptedException
        {
            final PC pc = new PC();

            Thread t1 = new Thread(new Runnable() {   //ANONYMOUS CLASS
                @Override
                public void run()
                {
                    try {
                        pc.produce();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Create consumer thread
            Thread t2 = new Thread(new Runnable() {      //ANONYMOUS CLASS
                @Override
                public void run()
                {
                    try {
                        pc.consume();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Start both threads
            t1.start();
            t2.start();

            //join waits for the thread to die
            //T1 will die before t2 , because its the producer.
            t1.join();
            t2.join();
        }

        // This class has a list, producer(adds items to list
        // and consumer (removes items).
        public static class PC {

            // Create a list shared by producer and consumer
            // Size of list is 2.
            LinkedList<Integer> list = new LinkedList<>();
            int capacity = 2;

            // Function called by producer thread
            public void produce() throws InterruptedException
            {
                int value = 0;
                while (true) {
                    synchronized (this)  //synchronized on this monitor object PC
                    {
                        // producer thread waits while list
                        // is full
                        while (list.size() == capacity)
                            wait();

                        System.out.println("Producer produced-"
                                + value);
                        //add the value
                        list.add(value++);

                        notify(); //notify the consumer, to stop waiting

                    }
                }
            }

            // Function called by consumer thread
            public void consume() throws InterruptedException
            {
                while (true) {
                    synchronized (this)
                    {
                        // consumer thread waits while list
                        // is empty
                        while (list.size() == 0)
                            wait();

                        // to retrieve the ifrst job in the list
                        int val = list.removeFirst();

                        System.out.println("Consumer consumed-"
                                + val);

                        notify();
                    }
                }
            }
        }

}
