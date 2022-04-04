import java.util.Scanner;

public class TextExerOne {
    public static void main(String[] args) {
        //Use while loop and read strings until you receive "end".
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!"end".equals(line)){
            //Reverse the string with for loop. Start from the last index and append each symbol to the new string.
            String reversed = "";
            for (int i = line.length()-1; i >=0 ; i--) {
                reversed+= line.charAt(i);
            }
            //Print the reversed string in the specified format.
            System.out.printf("%s = %s%n", line,reversed);
            line = scanner.nextLine();
        }

    }
}
