import java.util.Random;
import java.util.Scanner;

public class a01_lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < words.length ; i++) {
            int swapIndex = rnd.nextInt(words.length);

            String tmp = words[i];
            words[i] = words[swapIndex];
            words[swapIndex] = tmp;
        }
        for (int i = 0; i <words.length ; i++) {
            System.out.println(words[i]);
        }
    }
}
