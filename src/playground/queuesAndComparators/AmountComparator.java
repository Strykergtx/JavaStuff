package playground.queuesAndComparators;

import java.util.Comparator;

public class AmountComparator implements Comparator<DataExample> {

    //ascending order of amount
    @Override
    public int compare(DataExample d1, DataExample d2) {
        if(d1.getAmount() > d2.getAmount())
            return  1;
        else if(d1.getAmount() < d2.getAmount())
            return -1;
        else
            return 0;
    }
}
