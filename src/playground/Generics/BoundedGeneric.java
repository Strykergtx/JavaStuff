package playground.Generics;

public class BoundedGeneric <T extends A>{


    public void doSomething(T obj1)
    {
        System.out.println(obj1.doSomething());
    }

}
