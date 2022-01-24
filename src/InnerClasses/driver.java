package InnerClasses;

public class driver {

    public static void main(String args[])
    {

        ClassA.InnerClass in = new ClassA.InnerClass(45);
        ClassA.t.run();
        in.doSomething();
        ClassA A = new ClassA(100);
        //A.NonStaticInnerClass nic = new A.NonStaticInnerClass(45); PRODUCES ERROR
        ClassA.NonStaticInnerClass nic= A.new NonStaticInnerClass(45);
        nic.doSomething();
        A.doSomething();
        A.testingIf(in,nic);
        A.anonymousTest();
        //static reference from an instance variable , not the right pattern but works
        A.t.run();

    }

}
