import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MidExamSugarCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <inputNumbers.length ; i++) {
            int current = Integer.parseInt(inputNumbers[i]);
            numbers.add(current);
        }
        String command = scanner.nextLine();
        while(!command.equals("Mort")){
            String[] inputComands = command.split(" ");
            String doCommand = inputComands[0];
            if ("Add".equals(doCommand)) {
                int added = Integer.parseInt(inputComands[1]);
                numbers.add(added);
            } if ("Remove".equals(doCommand)) {
                int removed = Integer.parseInt(inputComands[1]);
                for (Integer number : numbers) {
                    if (number == removed) {
                        numbers.remove(number);
                       break;
                    }

                }
            } if ("Replace".equals(doCommand)) {
                int value = Integer.parseInt(inputComands[1]);
                int replacement = Integer.parseInt(inputComands[2]);


                for (int i = 0; i < numbers.size() ; i++) {
                    if (numbers.get(i) == value) {
                        numbers.set(i, replacement);
                        break;
                    }
                }

            } if ("Collapse".equals(doCommand)) {
                int lessThanValue = Integer.parseInt(inputComands[1]);

                for (int i = 0; i < numbers.size() ; i++) {
                    int current = numbers.get(i);
                    if (current < lessThanValue) {
                        numbers.remove(i);
                        i--;
                    }
                }

            }
            command = scanner.nextLine();
        }








      printNumList(numbers);
    }
    public static void printNumList(List<Integer> numbers){
        for (Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
