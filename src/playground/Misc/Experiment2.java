package playground.Misc;

public class Experiment2 {

    public static void main(String[] args) {

        String x ="YO";
        String y ="YO";

        if(x==y)
        {
            System.out.println("Equal1"); //THIS WORKS!!
            System.out.println(x.hashCode());
            System.out.println(y.hashCode());
        }

        String a = new String("YO");
        String b = new String("YO");

        if(a==b)
        {
            System.out.println("Equal2"); //THIS DOES NOT WORK ?
        }

        Integer i1 = 5;
        Integer i2 = 5;

        if(i1==i2)
        {
            System.out.println("Integer is equal 1");
        }

        Integer i3 = new Integer(5);
        Integer i4 = new Integer(5);

        if(i3==i4)
        {
            System.out.println("Integer is equal 2");
        }
      //  https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/

    }

}
