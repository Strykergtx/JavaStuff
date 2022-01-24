package playground.Experiment1;

interface InterfaceB {

    int interfaceBVariable = 15;

    void interfaceBFunction1();
    void interfaceBFunction2();

    //FOR EXPERIMENT 2
    default void functionWithSameName()
    {
        System.out.println("Called from InterfaceB");
    }


}
