package playground.Generics;

abstract class A {
    int x = 10;

    A(int x)
    {
       this.x = x;
    }

    abstract public String doSomething();

    private A getInstance() {
        return this.getInstance();
    }
}
