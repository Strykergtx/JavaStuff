package cloning.CloneMethodShallow;

public class Test2 implements Cloneable {
    int a;  //primitive type
    int b;  //primitive type
    Test c = new Test();  //User defined Object type Test
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
