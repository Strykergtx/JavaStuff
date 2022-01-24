package playground.Experiment1;

public class Experiment3 extends Experiment{

    //constructor needed because Experiment's superclass which is AbstractClassA has a variable which is set via a constructor.
    //Experiment is extended by Experiment3 so now this needs it too.
    Experiment3(int x) {
        super(x);
    }
}
