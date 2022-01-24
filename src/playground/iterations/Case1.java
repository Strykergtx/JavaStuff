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

//        iterator = list.iterator();             //it has to be reset everytime
//        while (iterator.hasNext()) {
//            iterator.remove();               //illegal state exception thrown
//        }


     //
//        iterator = list.iterator();             //it has to be reset everytime
//        while (iterator.hasNext()) {
//             String element = iterator.next();  //does not throw any exception why ?
//            iterator.remove();         //because we are modifying iterator
//        }
        //reason -https://www.tutorialspoint.com/use-iterator-to-remove-an-element-from-a-collection-in-java#:~:text=An%20element%20can%20be%20removed,the%20exception%20IllegalStateException%20is%20thrown.



        // throws concurrent modification exception
        iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println("List Value:" + value);
            if (value.equals("Geeks"))
                list.remove(value);
        }

        iterator = list.iterator();            ///has to be reset everytime
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        //YOU CAN ACCESS ELEMENTS AND YOU CAN REMOVE ELEMENTS FROM COLLECTIONS WITH ITERATOR


    }
}
