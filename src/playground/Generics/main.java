package playground.Generics;

public class main {

    public static void main(String args[])
    {
        A typeB = new B(10);
        BoundedGeneric<A> bg = new BoundedGeneric();
        bg.doSomething(typeB);
    }
}
