import java.util.Scanner;

public class TextExerFive {
    public static void main(String[] args) {
        //Write a program that receives a single string and on the first line prints all the digits,
        // on the second – all the letters, and on the third – all the other characters.
        // There will always be at least one digit, one letter and one other characters.
        //•	Read the input.
        //•	Use loop to iterate through all characters in the text. If the char is digit print it, otherwise ignore it.
          //o	Use Character.isDigit(char symbol)
        //•	Do the same for the letters and other chars
          //o	Find something like isDigit method for the letters.
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder number = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {

            if(Character.isLetterOrDigit(input.charAt(i))){
                if (Character.isDigit(input.charAt(i))){
                    number.append(input.charAt(i));
                }
                else{
                    letters.append(input.charAt(i));
                }
            }
            else{
                symbols.append(input.charAt(i));
            }
        }
        System.out.println(number);
        System.out.println(letters);
       System.out.println(symbols);
    }
}
