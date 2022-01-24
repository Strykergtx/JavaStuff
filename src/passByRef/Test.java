package passByRef;

import java.util.ArrayList;

public class Test {

    int x;
     ArrayList<Integer> list;

     Test(int x, ArrayList<Integer> list)
     {
         this.list= list;
         this.x =x;

     }

     public ArrayList<Integer> modifyAndgetAccess()
     {
        this.list.add(15);
         return this.list;
     }

    public ArrayList<Integer> getAccess()
    {
        return this.list;
    }

}
