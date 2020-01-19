package string.problems;


import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {

        String value = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        value = value.toLowerCase();
        HashMap<String, Integer> counter = new HashMap<>();
        for (String word : value.split(" ")) {

            int num = counter.getOrDefault(word, 0);
            counter.put(word, num + 1);
        }

        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Duplicates from :"+value);
        for (String key : counter.keySet()) {

            ar.add(key.length());
            if (counter.get(key) > 1)
                System.out.println(key + " " + counter.get(key));

        }
        Integer sum = 0;
        for (Integer length : ar) {
            sum += length;
        }
        int average = sum / ar.size();

        System.out.println("length of average words in the sentence : " + average);
    }
}



