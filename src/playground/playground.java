package playground;

import static java.lang.Integer.valueOf;

public class playground {


    public static void main(String args[])
    {

        Integer a = 5;
        String x =   a.toString();
        String y = x.concat("gggggg");
        System.out.println(y);

        //Here valueOf is able to convert string based number to Integer object
        String s ="67";
        Integer q = valueOf(s);
        System.out.println(q);

        //here its not needed
        int primitive = 8;
        Integer b = valueOf(primitive);
        System.out.println(b);

        //every value of the object type primitive data classes, converts it to that type
        String gg =  "   geekss@for@geekss   ";
        String[] strarr = gg.split("s",-1);
        for(String temp: strarr)
        {
            System.out.println(temp);
            System.out.println("..");
        }

        String trimmed = gg.trim();
        System.out.println(trimmed);

    }

}
