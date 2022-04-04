import java.util.Scanner;

public class TextExerFour {
    public static void main(String[] args) {
        //TextFilter
        //Write a program that takes a text and a string of banned words.
        // All words included in the ban list should be replaced with asterisks "*", equal to the word's length.
        // The entries in the ban list will be separated by a comma and space ", ".
        //The ban list should be entered on the first input line and the text on the second input line.
        //•	Read the input.
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        //•	Replace all ban words in the text with asterisk (*).
        //o	Use the built-in method replace(banWord, replacement).
        for (String bannedWord: bannedWords) {
            text= text.replace(bannedWord, repeat("*", bannedWord.length()));
        }
        System.out.println(text);


    }

    private static String repeat(String word, int count) {
        String [] repeatArr = new String[count];
        for (int i = 0; i <count ; i++) {
            repeatArr[i] = word;
        }
        return String.join("",repeatArr);
    }
}

