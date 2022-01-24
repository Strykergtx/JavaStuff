package playground.Generics;

public class B extends  A{

    B(int x)
    {
        super(x);
    }

    @Override
    public String doSomething() {
        return "This is a class extending abstract class A";
    }
}
