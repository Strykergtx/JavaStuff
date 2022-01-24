package playground.FunctionHiding;

public class Driver {

    public static void main(String args[])
    {
        A obj = new B();
        obj.fun();

        B obj2 = new B();
        obj2.fun();
    }
}
