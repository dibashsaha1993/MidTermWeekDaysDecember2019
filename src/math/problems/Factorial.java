package math.problems;


public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println(recursion(5));




    }
    public static int recursion(int n){
        if (n==1){
            return 1;
        }else{

        }
        return n * recursion(n-1);
    }
}
//not done yet, Iteration missing//