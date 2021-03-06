import java.util.Scanner;

public class TextExerValidUserNames {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  //Read a string array.
        String[] words = scanner.nextLine().split(", ");

        for (String word: words) {
         if (validUsername(word)){
             System.out.println(word);
         }

        }



    }
    private static boolean validUsername(String username){
        if(username.length()< 3 || username.length()>16){
            return false;
        }
        for (int i = 0; i <username.length() ; i++) {
            char symbol = username.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-'  && symbol !='_' ) {
            return false;
            }
        }
        return  true;

    }
}
