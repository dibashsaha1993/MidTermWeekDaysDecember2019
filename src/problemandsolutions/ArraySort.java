package problemandsolutions;

import java.util.Arrays;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9,10} ;


      Arrays.sort(ar);
        System.out.println("Now it will show in ascending order");
        for(int ar1:ar){
            System.out.println(ar1);

        }

    }

}
