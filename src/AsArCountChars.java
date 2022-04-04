import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AsArCountChars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> chars = new LinkedHashMap<>();

        String input = sc.nextLine();
        for (char symbol : input.toCharArray() ) {
            if (symbol != ' '){
                if (chars.containsKey(symbol)){
                int count = chars.get(symbol);
                chars.put(symbol, count + 1);// updating the value
                }else {
                 chars.put(symbol, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        chars.forEach((k,v) -> System.out.println(k + " -> " + v ));
    }
}
