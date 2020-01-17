package math.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}

    private static int[]duplicate(int[]ar1, int []ar2){
        return IntStream.concat(IntStream.of(ar1),IntStream.of(ar2))
                .distinct()
                .sorted()
                .toArray();

    }

    public static void main(String[] args)
    {

        int [] ar1={1,3,4};
        int [] ar2={4,5,6,7,8};
        int [] lastAr=duplicate(ar1,ar2);

        System.out.println("first array: "+ Arrays.toString(ar1));
        System.out.println("second array: "+ Arrays.toString(ar2));
        System.out.println("merged and duplicate removed: "+ Arrays.toString(lastAr));
    }
}
