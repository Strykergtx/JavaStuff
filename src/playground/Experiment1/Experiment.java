package playground.Experiment1;

public class Experiment extends AbstractClassA implements InterfaceA{

    //constructor needed because Experiment's superclass which is AbstractClassA has a variable which is set via a constructor.
    Experiment(int x) {
        super(x);
    }

    @Override
    void AbstractClassAfunction1() {

    }

    @Override
    public void abstactClassAFunction1() {

    }

    @Override
    public void interfaceAFunction1() {

    }

    @Override
    public void interfaceAFunction2() {

    }
}
