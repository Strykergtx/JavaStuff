package playground.Misc.PassByReferenceCheck2;

public class Experiment3 {

    public void fnx1(SomeClass sc)
    {
        sc.setX(55);
        System.out.println(sc.hashCode());
    }

    public void fnx2(SomeClass sc)
    {

        if(sc!=null)
        {
            sc.setX(35);
            fnx1(sc);
            System.out.println(sc.hashCode());
        }
        else
        {
            sc = new SomeClass(35);
                    fnx1(sc);

        }


    }

}
