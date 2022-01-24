package cloning.CloneMethodShallow;

public class main {
    public static void main(String args[])
            throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t2 = (Test2)t1.clone();

        System.out.println(System.identityHashCode(t2));
        System.out.println(System.identityHashCode(t1));

        //changing stuff in T2
        t2.a = 100;
        t2.c.x = 300;

        System.out.println(t1.a + " " + t1.b + " " + t1.c.x
                + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x
                + " " + t2.c.y);

        //Shallow copy here means that we are creating A NEW OBJECT ALTOGETHER WITH SEPARATE MEMORY LOCATIONS
        //BUT, the object variable Test c inside t2 and t1 are STILL SHARED !!!
    }
}