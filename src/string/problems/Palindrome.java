package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String straight = "GunMan";

        String reverse = "";
        try {

            for (int i = straight.length() - 1; i >= 0; i--) {
                reverse += straight.charAt(i);
                System.out.println(reverse);
            }

            boolean LearnPalindrome = true;
            for (int i = 0; i < straight.length(); i++) {
                if(straight.charAt(i)!=reverse.charAt(i)){
                    LearnPalindrome=false;
                }
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("exception found");
        }
    }
}

//done//