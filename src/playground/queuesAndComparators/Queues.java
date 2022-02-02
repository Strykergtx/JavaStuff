package playground.queuesAndComparators;

import java.util.*;

public class Queues {

    public static void main(String args[])
    {
        //LinkedList used as Queue, this is the normal way a queue can be implemented
        Queue<Integer> lq = new LinkedList<>();

        //PriorityQueue with fixed capacity
        Queue<Integer>  qint = new PriorityQueue<>(5);


        //natural order ,the lowest number picked first.
        Queue<Integer>  q = new PriorityQueue<>();
        q.add(5);
        q.add(6);
        q.add(3);
        q.add(25);

        Iterator<Integer> iterator = q.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("Normal Priority Queue in natural order");
        System.out.println(q.peek());
        q.poll();  //removes the head/top or FIRST IN element
        System.out.println(q.peek());
        q.remove(25); //removes the specified element

        //natural order, the lowest number picked first.
        Queue<Integer>  q1 = new PriorityQueue<>(Comparator.comparingInt(n -> n));
        q1.add(5);
        q1.add(6);
        q1.add(3);
        q1.add(25);

        System.out.println("Priority Queue with comparator ascending order");
        System.out.println(q1.peek());
        q1.poll();
        System.out.println(q1.peek());

        //reverse of natural order using reversed()
        Queue<Integer>  q2 = new PriorityQueue<>(Comparator.comparingInt(n -> (Integer) n).reversed());
        q2.add(5);
        q2.add(6);
        q2.add(3);
        q2.add(25);

        System.out.println("Priority Queue with comparator descending order");
        System.out.println(q2.peek());
        q2.poll();
        System.out.println(q2.peek());

        //reverse of natural order using reverseOrder()
        Queue<Integer>  q3 = new PriorityQueue<>(Comparator.reverseOrder());
        q3.add(5);
        q3.add(6);
        q3.add(3);
        q3.add(25);

        System.out.println("Priority Queue with comparator descending order with reverseOrder");
        System.out.println(q3.peek());
        q3.poll();
        System.out.println(q3.peek());

        //Strings in Queue
        Queue<String> q4 = new PriorityQueue<>(Comparator.comparingInt(String::length));
        q4.add("E");
        q4.add("Example");
        q4.add("Rex");
        q4.add("Magic");

        System.out.println("Priority Queue with comparator based on string length in natural order");
        System.out.println(q4.peek());
        q4.poll();
        System.out.println(q4.peek());

        //Prototype for string comparison reverse order
        //Queue<String> q4 = new PriorityQueue<>(Comparator.comparingInt(String::length).reversed());


        //User defined object based queues
        //you cannot use hashcode or equals for this to compare
        //either do this thing below or implement custom comparators in your custom class
        //Observe 2 values are same for A400 and A300, we use the second tie-breaker for this
        Comparator<DataExample> COMPARISON_RULE = Comparator.comparing(DataExample::getAmount,Comparator.reverseOrder()).thenComparing(DataExample::getStat);


        Queue<DataExample> dataQueue = new PriorityQueue<>(COMPARISON_RULE);
        dataQueue.add(new DataExample(5000,45,"T500"));
        dataQueue.add(new DataExample(450,50,"A300"));
        dataQueue.add(new DataExample(450,45,"A400"));
        dataQueue.add(new DataExample(3500,45,"MX400"));
        dataQueue.add(new DataExample(1500,45,"G250"));

        System.out.println("Priority Queue with comparator rule over DataExample");
        System.out.println(dataQueue.peek().getName());
        dataQueue.poll();
        System.out.println(dataQueue.peek().getName());


        //with custom comparators
        //Compare stats, put that in descending order then produce list 1
        //arrange list 1 again based on values of Amount in ascending order and this becomes a tier breaker for first one
        Queue<DataExample> dataQueue2 = new PriorityQueue<>(new StatComparator().thenComparing(new AmountComparator()));
        dataQueue2.add(new DataExample(5000,45,"T500"));
        dataQueue2.add(new DataExample(450,50,"A300"));
        dataQueue2.add(new DataExample(450,45,"A400"));
        dataQueue2.add(new DataExample(3500,45,"MX400"));
        dataQueue2.add(new DataExample(1500,45,"G250"));

        System.out.println("Priority Queue with comparator interface implementation ");
        System.out.println(dataQueue2.peek().getName());
        dataQueue2.poll();
        System.out.println(dataQueue2.peek().getName());


        //Normal Arraylist comparators
        ArrayList<DataExample> arr = new ArrayList<>();
        arr.add(new DataExample(5000,45,"T500"));
        arr.add(new DataExample(450,50,"A300"));
        arr.add(new DataExample(450,45,"A400"));
        arr.add(new DataExample(3500,45,"MX400"));
        arr.add(new DataExample(1500,45,"G250"));

        System.out.println("Normal sorting using Collections.sort");
       arr.sort(new AmountComparator());
       for(DataExample d : arr)
       System.out.println(d.getName());  //ascending order of Amount

        arr.sort(new AmountComparator().thenComparing(new StatComparator()));
        System.out.println("--------");
        for(DataExample d : arr)
            System.out.println(d.getName());  //ascending order of Amount

        //Collections.sort() can also be used but discouraged, as its older implementation

        ArrayList<DataExample> arr2 = new ArrayList<>();
        arr2.add(new DataExample(5000,45,"T500"));
        arr2.add(new DataExample(450,50,"A300"));
        arr2.add(new DataExample(450,45,"A400"));
        arr2.add(new DataExample(3500,45,"MX400"));
        arr2.add(new DataExample(1500,45,"G250"));
        Collections.sort(arr2);
        System.out.println("Using Comparable interface");
        for(DataExample d : arr)
            System.out.println(d.getName());


    }


}
