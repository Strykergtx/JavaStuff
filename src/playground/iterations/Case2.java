package playground.iterations;

import java.util.*;
import java.util.concurrent.*;

class Case2 {
    public static void main(String[] args)
    {

        CopyOnWriteArrayList<String> list
                = new CopyOnWriteArrayList<>();

        // Initial Iterator
        Iterator<String> itr = list.iterator();
        list.add("GfG");
        list.add("GfG2");
        list.add("GfG3");
        list.add("GfG4" +
                "");
        //EMPTY NOW because iterator was created before you added anything to list
        //iterator is in older state.
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());

//        // iterator after adding an element
//        itr = list.iterator();
//        System.out.println("List contains:");
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            itr.remove();  //throws UnsupportedOperationException , CopyOnWriteArrayList
//        }

        itr = list.iterator();
        while (itr.hasNext()) {
            String value = itr.next();
            System.out.println("List Value:" + value);
            if (value.equals("GfG3"))
                list.remove(value);  //no exception
        }
        // list.remove does not throw ConcurrentModificationException for this List Type.
        itr = list.iterator();
        System.out.println("List contains: ");
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}