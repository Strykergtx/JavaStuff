package playground.Experiment1;

public class Experiment2 implements InterfaceA,InterfaceB {
    @Override
    public void interfaceAFunction1() {

    }

    @Override
    public void interfaceAFunction2() {

    }

    //OBSERVE YOU ARE STILL ABLE TO OVER-RIDE A DEFAULT FUNCTION, IF YOU DON'T WANT TO ITS FINE
    @Override
    public void interfaceADefaultFunction() {
        InterfaceA.super.interfaceADefaultFunction();
    }


    //WE ARE ABLE TO ACCESS 2 SAME NAMED FUNCTIONS FROM BOTH INTERFACES USING THIS FORMAT OF SUPER.
    //ITS NECESSARY TO DO IT HERE, BECAUSE COMPILER WON'T KNOW WHICH VERSION TO CALL AT RUNTIME
    @Override
    public void functionWithSameName() {
        InterfaceA.super.functionWithSameName();
        InterfaceB.super.functionWithSameName();
    }

    @Override
    public void interfaceBFunction1() {

    }

    @Override
    public void interfaceBFunction2() {

    }
}
