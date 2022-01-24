package cloning.AC;

public class assignmentCopy {
    public static void main(String[] args)
    {
        A ob1 = new A();

        System.out.println(ob1.x + " " + ob1.y);


        A ob2 = ob1;
        ob2.x = 100; //change made in ob2 to primitive data reflected

        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
        System.out.println(System.identityHashCode(ob1));
        System.out.println(System.identityHashCode(ob2)); //same hashcode
    }

}
