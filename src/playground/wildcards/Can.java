package playground.wildcards;

public class Can<T extends Coke> {
    T obj;
    Can(T obj)
    {
        this.obj = obj;
    }
    public void identify()
    {
        System.out.println("I am a can of -");
        obj.identify();
    }

}
