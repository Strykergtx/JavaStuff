package playground.queuesAndComparators;

import java.util.Objects;

public class DataExample implements Comparable<DataExample> {

    int dataA; //amount
    int dataB; //some other stat
    String name;

    DataExample(int a, int b, String name)
    {
        this.dataA = a;
        this.dataB = b;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataExample that = (DataExample) o;
        return dataA == that.dataA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataA);
    }

    public String getName()
    {
        return this.name;
    }

    public int getAmount()
    {
        return this.dataA;
    }

    public int getStat()
    {
        return  this.dataB;
    }


    @Override
    public int compareTo(DataExample d) {
         return(this.getAmount()-d.getAmount());
         //only one argument here,only one field can be compared
    }
}
