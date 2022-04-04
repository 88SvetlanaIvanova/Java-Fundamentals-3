import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AsoArFillInYheMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String , Integer> chars = new LinkedHashMap<>();
        String input = sc.nextLine();


        while(!input.equals("stop")){
            if (!chars.containsKey(input)){
                chars.put(input,0);
            }
            int quantity = Integer.parseInt(sc.nextLine());
            chars.put(input, chars.get(input) + quantity);


            input = sc.nextLine();

        }
        for (Map.Entry<String, Integer> entry : chars.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%s -> %d%n", key, value);

        }

    }
}
