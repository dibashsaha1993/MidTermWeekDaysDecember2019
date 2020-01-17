package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int k, a = 1, b = 1;
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter your number");
        k = 0;
        int n = sd.nextInt();
        System.out.print("1 1 ");
        while (k <= 40) {
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;

        }
    }
}
//not done properly yet, needs to get 40 numbers//