package playground.Experiment1;

abstract class AbstactClassB {

    private int AbstractClassBPrivateVariable = 10;
    public int AbstractClassBPublicVariable = 0;

    AbstactClassB(int y)
    {
        this.AbstractClassBPublicVariable = y;
    }

    //access specifier is enforced here for functions
    abstract public void abstactClassBFunction1();

    abstract public void abstactClassBFunction2();

    //there is no default function to use here, just put function without abstract keyword
    //can be public/protected/private
    private void abstactClassBFunction3()
    {
       System.out.println("This is the default implementation method for Abstract class");
    }

    //this is allowed, private is not allowed. Because the function will need Over-riding
    //and private will not allow the function to be used outside this abstract class.
    abstract protected void abstactClassBFunction4();

    //you don't need to put private +final together , either one is enough
    final void abstactClassBFinalFunction()
    {
        System.out.println("Final");
    }

    public static void staticFunction()
    {
        System.out.println("Static function ");
    }

}
