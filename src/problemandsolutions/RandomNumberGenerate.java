package problemandsolutions;
import java.util.Random;
public class RandomNumberGenerate {

    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        Random rd = new Random();
        int num;
        for (int i = 1; i < 2; i++) {
            num = rd.nextInt(8)+1;
            System.out.println(num);
        }
    }
}



//done//