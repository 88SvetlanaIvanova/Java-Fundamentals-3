import java.util.Scanner;

public class TextExerLettersChangeNumbers {
    public static void main(String[] args) {
        //You get a string consisting of a number between two letters.
        // Depending on whether the letter was in front of the number or after it
        // you would perform different mathematical operations on the number to achieve the result.
        //First you start with the letter before the number.
        //•	If it's uppercase you divide the number by the letter's position in the alphabet.
        //•	If it's lowercase you multiply the number with the letter's position in the alphabet.
        Scanner scanner = new Scanner(System.in);
        String tokens [] = scanner.nextLine().trim().split("\\s+");
        double sum =0;
        double resultDevidedOrMultiplied = 0;
        double resultMultiplied = 0;
        double resultNumber = 0;

        for (String input: tokens) {
            char firstLetter = input.charAt(0);
            char secondLetter = input.charAt(input.length() - 1);


            String newLine = input.substring(1, input.length() - 1);//trimming ends of the word via substring method
            double number = Double.parseDouble(newLine);

            int numPositionInAlphabet = findPosition(firstLetter);
            int lastNumPositionInAlphabet = findPosition(secondLetter);


                if (Character.isUpperCase(firstLetter)){
                    //If it's uppercase you divide the number by the letter's position in the alphabet.


                    sum += number/numPositionInAlphabet;
                }else {
                    //•	If it's lowercase you multiply the number with the letter's position in the alphabet.
                   sum += number * numPositionInAlphabet;
                }



                if (Character.isUpperCase(secondLetter)){
                    sum -=  lastNumPositionInAlphabet;
                    }

                else {
                    sum +=  lastNumPositionInAlphabet;
                }


        }
        System.out.printf("%.2f", sum);

    }
    private static int findPosition(char c)
    {
       // int findPosition = Character.toLowerCase(c) - Character.getNumericValue('a') + 1;
        // converting input letter in to uniform case.
        char targetChar= Character.toLowerCase(c);
        // COnverting chat in to its ascii value
        char initialChar = 'a';
        int asciiValueOfinputChar= (int)targetChar;
        // ASCII value of lower case letters starts from 97
        int position= targetChar - initialChar + 1;     //asciiValueOfinputChar-96;

        return position;

    }

}
