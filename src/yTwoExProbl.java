import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class yTwoExProbl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//([@#+]{1,})([a-z]{3,})([@#+]{1,})([\\W]){1,}([/])([0-9]{1,})([/]){1,}"
        String regex = "([@#+]{1,})([a-z]{3,})([@#+]{1,})?([\\W]*)?([/]*)?([0-9]{1,})([/]){1,}";
        Pattern pattern = Pattern.compile(regex);


            String input = scanner.nextLine();
            Matcher matcher= pattern.matcher(input);

        boolean match = matcher.find();


            while(match){



                double number = Double.parseDouble(matcher.group(6));
                String fruit = matcher.group(2);
                System.out.printf("You found %.0f %s eggs!%n", number, fruit);

                match = matcher.find();



        }
    }
}
