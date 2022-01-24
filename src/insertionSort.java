import java.util.Arrays;

public class insertionSort {


    public static void sort(int[] arr)
    {
        int n=arr.length;
        for(int i = 1;i<n;i++)
        {
            int current = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }


    }
    public static void main(String args[])
    {
        int[] arr = new int[]{6,5,4,3,2,1};

        sort(arr);
        for(int x:arr)
       System.out.println(x);

    }
}
