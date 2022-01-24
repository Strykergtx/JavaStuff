import playground.threads.Creator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {


    public static void main(String args[])
    {
        //A list inside a list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  //no need to mention its structure again on the right side
        list.add(new ArrayList<>());// no need to mention its integer type again here.
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);


        for(ArrayList<Integer> l : list)
        {
            for (Integer i : l)
                System.out.println(i);
        }

        list.get(0).remove(2); //when removing or accessing via get you need to use index 0.......N

        for(ArrayList<Integer> l : list)
        {
            for (Integer i : l)
                System.out.println(i);
        }

        String[] a = new String[] { "A", "B", "C", "D" };

        //GIVES WARNINGS BUT STILL ALLOWS HETEROGENEOUS ELEMENTS IN IT.
        ArrayList b = new ArrayList();
        b.add(1); // integer
        b.add("any string"); // any string
        b.add(new Creator()); //any object

        //ArrayList<String> slist = Arrays.asList(a); does not work for arraylist

        List<String>  slist = Arrays.asList(a);
        //slist.add("E");  //this is not supported for List, normal List is immutable, throws UnsupportedOperationException
        for(String s : slist)
            System.out.println(s);

        // ArrayList<String> words = {"YOLO","LETSGO"}; ARRAY initializer cannot be used here

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello","World"));  //passing it to constructor works

       //normal array initialization
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        Integer[] arr = new Integer[]{1,2,3,4,5};

        //multi-dimensional arrays in java

       // Two dimensional array:
       int[][] twoD_arr = new int[3][3];

       //individual insert into rows
       twoD_arr[0] = new int[]{1, 2, 3};
       twoD_arr[1] = new int[]{4, 5, 6};
       twoD_arr[2] = new int[]{7, 8, 9};
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(twoD_arr[i][j] + " ");

            System.out.println();
        }

       //Three dimensional array:
       int[][][] threeD_arr = new int[10][20][30];

       //3 dimensional initialization
        int[][][] multi3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        int multi[][] = { {2,7,9},{3,6,1},{7,4,2} };

        // printing 2D array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(multi[i][j] + " ");

            System.out.println();
        }

    }

}
