import java.util.Arrays;
import java.util.Scanner;

public class p02ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String input = sc.nextLine();

        while(!"end".equals(input)){
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command){
                case"swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    int temp = numbers[index1];
                    numbers[index1]= numbers[index2];
                    numbers[index2] = temp;
                    break;
                case "multiply":
                    int index1multiply = Integer.parseInt(tokens[1]);
                    int index2multiply = Integer.parseInt(tokens[2]);
                    numbers[index1multiply] = numbers[index1multiply] * numbers[index2multiply];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length ; i++) {
                        numbers[i]-=1;
                    }
                    break;
            }
            input = sc.nextLine();
        }


        for (int i = 0; i < numbers.length ; i++) {
            if (i < numbers.length - 1 ){
                System.out.print(numbers[i] + ", ");
            }
            else{
                System.out.print( numbers[i]);
            }
        }


    }
}
