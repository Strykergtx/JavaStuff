package playground.Experiment1;

abstract class AbstractClassD extends AbstractClassA{
    //ABSTRACT CLASS CAN EXTEND ANOTHER ABSTRACT CLASS, BUT ONLY ONE COS ITS AN ABSTRACT "CLASS" NOT INTERFACE
    AbstractClassD(int x) {
        super(x);
    }

    abstract void AbstractClassDFunction1();
}
