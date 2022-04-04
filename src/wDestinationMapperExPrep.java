import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wDestinationMapperExPrep {
    public static void main(String[] args) {
//(([=/])[A-Z][A-Za-z]{2,}\1)
        Scanner sc = new Scanner(System.in);
        String placesStr = sc.nextLine();
        //regex
        Pattern pattern = Pattern.compile("([=/])([A-Z][A-Za-z]{2,})\\1");
        //matcher does search
        Matcher matcher = pattern.matcher(placesStr);

        List<String> locations = new ArrayList<>();
        while(matcher.find()){
            locations.add(matcher.group(2));

        }
        System.out.println("Destinations: "+String.join(", ", locations));

        System.out.println("Travel Points: "+ locations.stream().mapToInt(l -> l.length()).sum());

    }
}
