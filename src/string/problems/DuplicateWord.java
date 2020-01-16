package string.problems;


public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        System.out.println(st);

        String characters = "";
        String duplicates = "";

        for (int i = 0; i < st.length(); i++) {
            String current = Character.toString(st.charAt(i));
            if (!duplicates.contains(current)) {
                duplicates += current + ",";
            }

            characters += current;
            System.out.println(duplicates);
        }
    }
}
//not done, needs to modify to string//
