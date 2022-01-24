package playground.queuesAndComparators;

import java.util.Deque;
import java.util.LinkedList;

public class Dq {

    public static void main(String args[])
    {
        //Double ended queue can add elements from left side or right side and also remove from both these sides
        Deque<String> deque = new LinkedList<String>();
        deque.add("Example1");
        deque.add("Example2");
        deque.addFirst("Example3");
        deque.addLast("Example4");
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        //You can use iterator for deque


        }

}
