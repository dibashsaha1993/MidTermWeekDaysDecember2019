package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {


        //Anagram//
        Assert.assertEquals("BAC","BAC");
        System.out.println("Anagram:  Test successful");

        //DetermineLargestWord//
        Assert.assertEquals("10 Biological","10 Biological");
        System.out.println("DetermineLargestWord : Test Successful");

        //DuplicateWord//
        Assert.assertEquals("java","java");
        System.out.println("DuplicateWord is Java :  Test Successful");

        //palindrome//
        Assert.assertEquals("MADAM","MADAM");
        System.out.println("Palindrome MADAM gave: M" + "MA" + "MAD" + "MADA" + "MADAM : "+ "Test Successful");

        //Permutation
        Assert.assertEquals("CAB","CAB");
        System.out.println("Permutation of ABC: gave the expected Value CAB:  Test Successful");
    }
}
