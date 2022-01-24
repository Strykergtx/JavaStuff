package playground.Experiment1;

public class Experiment5 extends AbstactClassB implements InterfaceA,InterfaceB{
    Experiment5(int y) {
        super(y);
    }

    @Override
    public void abstactClassBFunction1() {

    }

    @Override
    public void abstactClassBFunction2() {

    }

    @Override
    protected void abstactClassBFunction4() {

    }

    @Override
    public void interfaceAFunction1() {

    }

    @Override
    public void interfaceAFunction2() {

    }


    //ITS NECESSARY TO DO IT HERE, BECAUSE COMPILER WON'T KNOW WHICH VERSION TO CALL AT RUNTIME
    @Override
    public void functionWithSameName() {
        InterfaceA.super.functionWithSameName();
    }

    @Override
    public void interfaceBFunction1() {

    }

    @Override
    public void interfaceBFunction2() {

    }
}
