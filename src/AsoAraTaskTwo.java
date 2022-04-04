import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AsoAraTaskTwo {
    public static void main(String[] args) {
        Map<Double, Integer> numberOccurences = new TreeMap<>();
        String[] numbersAsStrings = new Scanner(System.in).nextLine().split(" ");
        double[] numbers = new double[numbersAsStrings.length];
        for (int i = 0; i <numbersAsStrings.length ; i++) {
            double number = Double.parseDouble(numbersAsStrings[i]);

            Integer occurences = numberOccurences.get(number);
            if (occurences == null){
                occurences = 0;
            }

            numberOccurences.put(number,occurences + 1);
        }
        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
