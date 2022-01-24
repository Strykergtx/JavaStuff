package playground.Experiment1;

public interface InterfaceC  extends InterfaceA,InterfaceB{
   //INTERFACES ARE ABLE TO EXTEND OTHER INTERFACES WITH EXTEND KEYWORD COS THEY ARE NOT CLASSES BUT INTERFACES.
    void InterfaceCFunction1();

    @Override
    default void interfaceAFunction1() {

    }

    @Override
    default void interfaceAFunction2() {

    }

    @Override
    default void functionWithSameName() {
        InterfaceA.super.functionWithSameName();
    }

    @Override
    default void interfaceBFunction1() {

    }

    @Override
    default void interfaceBFunction2() {

    }
}
