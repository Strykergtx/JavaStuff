package playground.Misc;

public class Experiment2 {

    public static void main(String[] args) {

        String x ="YO";
        String y ="YO";

        if(x==y)
        {
            System.out.println("Equal"); //THIS WORKS!!
        }

        String a = new String("YO");
        String b = new String("YO");

        if(a==b)
        {
            System.out.println("Equal"); //THIS DOES NOT WORK ?
        }

      //  https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/

    }

}
