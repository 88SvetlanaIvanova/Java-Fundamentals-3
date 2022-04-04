import java.util.*;

public class AsoAraTaskThree {
    public static void main(String[] args) {
        Map<String, List<String>> wordSynonims = new LinkedHashMap<>();
        Scanner scanner = new Scanner((System.in));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonim = scanner.nextLine();

            List<String> currentSynonims = wordSynonims.get(word);
            if (currentSynonims == null){
                currentSynonims = new ArrayList<>();
                wordSynonims.put(word, currentSynonims);
            }

            currentSynonims.add(synonim);

        }

        for (Map.Entry<String, List<String>> entry : wordSynonims.entrySet()) {
            System.out.println(entry.getKey() + " -> " + String.join(", ",entry.getValue()));
        }


    }
}
