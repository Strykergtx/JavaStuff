package playground.wildcards;

//observe the limiters here
public class Glass<T extends Juice & Fresh> {

    public void addJuice(T obj)
    {
        System.out.println("Added to glass");
    }
}
