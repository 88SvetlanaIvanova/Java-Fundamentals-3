import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FundOne {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 1, 32, 15, 96, 42, 7, 15));
        numbers.add(13);
        int[] counts = new int[101];//0-100
        for (int number: numbers) {
            counts[number]++;
        }
        for (int number = 0; number <=100 ; number++) {
            int count = counts[number];
            for (int i = 0; i <count ; i++) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
            
        }
    }
}
