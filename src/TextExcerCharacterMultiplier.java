import java.util.Scanner;

public class TextExcerCharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] tokens = scanner.nextLine().split("\\s+");
        String inputTwo = tokens[1];
        String inputOne = tokens[0];

        int sum = characterMultiplier(inputOne, inputTwo);
        System.out.println(sum);
    }
    private static int characterMultiplier(String wordOne, String wordTwo){
    int sum = 0;
        for (int i = 0; i <Math.min(wordOne.length(),wordTwo.length()) ; i++) {
            sum += wordOne.charAt(i) * wordTwo.charAt(i);
        }
        if (wordOne.length() > wordTwo.length()){
            for (int i = wordTwo.length(); i < wordOne.length() ; i++) {
               sum+= wordOne.charAt(i);
            }
        }else{
            for (int i = wordOne.length(); i < wordTwo.length(); i++) {
                sum += wordTwo.charAt(i);
            }
        }


    return sum;
    }
}
