package playground;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {

    public static void main(String args[])
    {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,7);
        map.put(1,6);
        map.put(2,5);
        map.put(3,6);


        boolean x;
        x= map.containsKey(2);
        System.out.println(x);

        x = map.containsValue(2);
        System.out.println(x);

        System.out.println(map.get(2));

        for(Integer i : map.values())
            System.out.println(i);

        for(Integer i : map.keySet())
            System.out.println(i);

        //method 1
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

        //method 2
        map.forEach(
                (key, value)
                        -> System.out.println(key + " = " + value));

        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();


        //method 3
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> mapElement = it.next();
            int marks = mapElement.getValue() + 10;
            System.out.println(mapElement.getKey() + " : " + marks);
        }
    }
}
