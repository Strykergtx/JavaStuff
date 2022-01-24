package passByRef;

import java.util.ArrayList;

public class driver {

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2) ;
        list.add(3) ;
        list.add(4) ;
        Test t= new Test(5,list);

            System.out.println(t.modifyAndgetAccess());

        list.add(16);//we are adding the value outside the object Test, still the value of list changes

        System.out.println(t.getAccess()); //this is getting printed from inside the Test object

        //this is happening because we are passing references instead of the object itself, in java all object are handled using references,which is passed by value
    }
}
