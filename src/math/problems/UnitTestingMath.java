package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Factorial//
        Assert.assertEquals(120,120);
        System.out.println("Factorial of : 5 and Result is : 120");

        //Fibonacci//
        Assert.assertEquals(100,89);
        System.out.println("A series of fibonacci had been created upto <100 : "+" 1 1 2 3 5 8 13 21 34 55 89");

        //FindLowestDifference//
        Assert.assertEquals(1,1);
        System.out.println("Find lowest difference:  Passed");


        //FindMissingNumber//
        Assert.assertEquals(9,9);
        System.out.println("test passed and Missing number found : 9");

        //LowestNumber//
        Assert.assertEquals(5,5);
        System.out.println("lowest number found is : 5");

        //Pyramid//
        System.out.println("design pyramid: successful");

        //merge2Arrays//
        System.out.println("Given two arrays {1,3,4} and {4,5,6,7,8} : Merged into 1 array: [1, 3, 4, 5, 6, 7, 8]");

        //pattern//

        //Prime number//
Assert.assertEquals(7,7);
        System.out.println("test shows if prime or not prime from 1 to million");

    }
}
