package playground.Generics;

public class Type1Generic<T,U> {

    T obj1;
    U obj2;

    Type1Generic(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void doSomething(T obj1)
    {

    }

    public T returnSomething()
    {
        return this.obj1;
    }

}
