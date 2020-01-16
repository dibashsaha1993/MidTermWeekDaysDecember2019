package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) throws Exception {
Scanner sd=new Scanner(System.in);
        System.out.println("enter quiz score");
        int quizScore=sd.nextInt();
        System.out.println("enter Mid term score");
        int MidTerm=sd.nextInt();
        System.out.println("enter final score");
        int FinalScore=sd.nextInt();
        int average=(quizScore+MidTerm+FinalScore)/3;
        char grade;
        System.out.println("Quiz Score: "+quizScore);
        System.out.println("Mid-Term score: "+MidTerm);
        System.out.println("Final Score: "+FinalScore);

        if(average>=90) {
            System.out.println("Your grade is A");

        } else if(average>=70) {
            System.out.println("Your grade is B");

        } else if(average>=50){
            System.out.println("Your grade is C");
        }else {
            System.out.println("Your grade is F");

        }
    }
}


