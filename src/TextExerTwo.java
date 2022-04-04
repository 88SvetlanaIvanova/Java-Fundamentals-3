import java.util.Scanner;

public class TextExerTwo {
    public static void main(String[] args) {
        //repeat strings
        //Write a program that reads an array of strings.
        // Each string is repeated n times, where n is the length of the string. Print the concatenated string.

        Scanner scanner = new Scanner(System.in);  //Read a string array.
        String[] words = scanner.nextLine().split(" ");
        //
      //  Initialize StringBuilder.
        StringBuilder result = new StringBuilder();
        //Iterate through elements in the array. Find the length of the word at each iteration
        // and append it to the StringBuilder.
        for (String word: words) {
             int count = word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }

        }
        System.out.println(result);




    }
}
