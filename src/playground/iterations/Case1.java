package playground.iterations;

import java.io.*;
import java.util.*;

class Case1{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        //all collections type are iterable
        Iterator<String> iterator = list.iterator();  //ITERATOR NEEDS THE OBJECT TYPE ITS STORING

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

        }


        //CASES FOR ITERATOR.REMOVE() AND LIST.REMOVE() INSIDE WHILE/DURING ITERATING

         //1 --------- RUN SEPARATELY
        //using iterator.remove() without iterator.next()
//        iterator = list.iterator();             //it has to be reset everytime
//        while (iterator.hasNext())
//        {
//            iterator.remove();               //illegal state exception thrown
//        }

        //2 --------- RUN SEPARATELY
        //using iterator.remove() with iterator.next() called BEFORE IT!!
//        iterator = list.iterator();             //it has to be reset everytime
//        while (iterator.hasNext()) {
//            String element = iterator.next();  //does not throw any exception why ?
//            System.out.println(element);
//            iterator.remove();         //because we are modifying iterator
//        }

        //reason -https://www.tutorialspoint.com/use-iterator-to-remove-an-element-from-a-collection-in-java#:~:text=An%20element%20can%20be%20removed,the%20exception%20IllegalStateException%20is%20thrown.

        //3 --------- RUN SEPARATELY
        // throws concurrent modification exception
//        iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String value = iterator.next();
//            System.out.println("List Value:" + value);
//            if (value.equals("Geeks"))
//                list.remove(value);
//        }


        // NOT A CASE-ONLY FOR CHECKING FINAL STATE OF LIST
        iterator = list.iterator();            ///has to be reset everytime
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        //YOU CAN ACCESS ELEMENTS AND YOU CAN REMOVE ELEMENTS FROM COLLECTIONS WITH ITERATOR



        //REMOVE FUNCTION ON MAP ITERATOR - it works!!
        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,7);
        map.put(4,3);
        map.put(2,5);
        map.put(3,6);

        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();

        //method 3
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> mapElement = it.next();
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
            it.remove();

        }

    }
}
