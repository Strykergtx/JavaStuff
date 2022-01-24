package playground.Experiment1;

public interface InterfaceA {

    //private not allowed here and no need of access specifiers.
    int interfaceAVariable = 5;

    //no constructors allowed in Interfaces

    void interfaceAFunction1();

    void interfaceAFunction2();

    //in-case you want default/common implementation
    default void interfaceADefaultFunction()
    {
        System.out.println("Default function allowed");
    }

    //static functions allowed
    static void staticFunction()
    {
        System.out.println("Static function");
    }

    //final functions not allowed
    //final void finalFunction(){
   //
  //  }

    //private is allowed
    private void staticFuntion2()
    {
        //body
    }

    //FOR EXPERIMENT 2
    default void functionWithSameName()
    {
        System.out.println("Called from InterfaceA");
    }

}
