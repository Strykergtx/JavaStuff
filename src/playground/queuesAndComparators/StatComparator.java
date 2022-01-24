package playground.queuesAndComparators;

import java.util.Comparator;

public class StatComparator implements Comparator<DataExample> {
    @Override
    public int compare(DataExample d1, DataExample d2) {

        //this should give us descending order based on stat
        if(d1.getStat() < d2.getStat())
            return  1;
        else if(d1.getStat() > d2.getStat())
            return -1;
        else
            return 0;
    }
}
