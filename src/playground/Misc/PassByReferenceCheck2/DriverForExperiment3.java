package playground.Misc.PassByReferenceCheck2;

public class DriverForExperiment3 {

    public static void main(String args[])
    {
        SomeClass sc =new SomeClass(15);

        System.out.println(sc.hashCode());


        Experiment3 exp = new Experiment3();
        exp.fnx2(sc);

        System.out.println(sc.getX());

        //--------------------------------------
        //If reference is null here no use of pass of reference if it does acquire a reference in the future
        SomeClass sc2 = null;
        exp.fnx2(sc2);
        System.out.println(sc2.getX());

    }
}
