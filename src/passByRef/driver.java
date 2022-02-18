package passByRef;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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


       /////Pass by reference affecting Collections  1
        Queue<Integer> q1 =  new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(4);
        q1.add(5);
        //q2=q1;       --makes the reference equal, does not copy elements
        q2.addAll(q1);  //copies elements from q1 to q2, references stay separate

        q2.add(6);
        q1.add(7);

        //both will be same if you used the first method, if you use addAll -they will be different
        System.out.println(q2);
        System.out.println(q1);

        //////Pass by reference affecting Collections  2
        List<List<Integer>> out = new ArrayList<>();

        List<Integer> currLevel = new ArrayList<>();
        currLevel.add(5);

        out.add(currLevel);
        currLevel.clear();
        System.out.println(out); //here you will get empty list inside list, cos you passed the currLevel as reference, which was cleared later on before printing

    }
}
