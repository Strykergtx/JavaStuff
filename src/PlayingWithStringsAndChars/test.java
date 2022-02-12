package PlayingWithStringsAndChars;

public class test {

    public static void main(String[] args)
    {

        //Getting specific values in integer from a String component
        //Here we are sure about the placements of the month indexes so charAt can be used
        String x = "2020-12-25";
        char ch = x.charAt(5);
        int a = (ch - '0')*10;
        char ch2 = x.charAt(6);
        int b = ch2 - '0';
        int idx = a+b;
        System.out.println(idx);  //int value
        System.out.println(x.substring(5,7)); //string value
    }
}
