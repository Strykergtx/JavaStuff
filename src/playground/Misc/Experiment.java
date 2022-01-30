package playground.Misc;

import java.util.ArrayList;
import java.util.List;

public class Experiment {

    public static void main(String[] args)
    {
        final Integer x = 5;

        //x= 10;   -does not work

        final List<Integer> list = new ArrayList<>();

        //this still works
        list.add(5);
        list.add(6);
        list.add(7);

       // list = new ArrayList<>();  -this does not work



    }

}
