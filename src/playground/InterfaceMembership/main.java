package playground.InterfaceMembership;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class main {

    public static void dummyFunction1(InterfaceB someInstance)
    {
        // someInstance. can only use f4 and f3
    }

    public static void dummyFunction2(InterfaceA someInstance)
    {
        //someInstance.   can only use f1 and f2
    }

    public static void dummyFunction3(A someInstance)
    {
        //someInstance. can use all functions of InterfaceB and InterfaceA and use f5 and f6
    }


    public static void main()
    {
        Inter instance = new SomeClass();  //Inter = REFERENCE TYPE, new SomeClass() = actual object being referenced.
        instance.f2();
        instance.f1();
        //instance.f3(); NOT POSSIBLE

        //See this example here
        //HashMap extends AbstractMap and implements Map, CloneAble and Serializable
        Map<Integer,Integer> map= new HashMap<>();

        //even this is possible

        Cloneable x = new HashMap<>();//x.  -only gives you options for 3 functions there is no add function

        Serializable y = new HashMap<>();//same here

        AbstractMap<Integer,Integer> z = new HashMap<>();//this one has some extra methods but does not have the Map methods



        //So what are interfaces ?
        //They create a contract for behaviour, if you use that interface as a substitute for an argument or reference type
        //make sure the instance you are creating on that reference has all required functions accessible via the interface.

        //So when you make future classes that implement a certain Interface I, you should make sure all the required and important
        //functions needed for the usage of the future class are Over-ridden by this future class, and it has no extra functions in it which
        //are deemed necessary for the functioning of this future class.






    }
}
