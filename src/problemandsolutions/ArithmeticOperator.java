package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {

    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("enter first value");
        double num1 = sd.nextDouble();
        System.out.println("enter second value");
        double num2 = sd.nextDouble();
        System.out.println("your addition value is: " + (num1 + num2));
        System.out.println("your subtraction value is: " + (num1 - num2));
        System.out.println("your multiply value is: " + (num1 * num2));
        System.out.println("your division value is: " + (num1 / num2));
    }
}


//done//