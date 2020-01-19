package string.problems;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

    Scanner scan=new Scanner(System.in);
        System.out.println("enter two word value");
String name=scan.nextLine();
String name1=scan.nextLine();

char ar1[]= name.toCharArray();
char ar2[]=name1.toCharArray();

Arrays.sort(ar1);
Arrays.sort(ar2);

String sortedname=new String(ar1);
String sortedname1=new String(ar2);

if(sortedname.equals(sortedname1)){
    System.out.println(name+"   "+name1+"   " +"This is anagram");
}else {
    System.out.println(name+"   "+name1+"   " +"This is not anagram");
}
    }
}

//Done//