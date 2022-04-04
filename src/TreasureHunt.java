import java.util.*;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[]split =  sc.nextLine().split("\\|");

        List<String> chest = new ArrayList<>(
                Arrays.asList(split));

        String command = sc.nextLine();

        while(!command.equals("Yohoho!")){
            String [] commandArguments = command.split(" ");
            String commandName = commandArguments[0];

            switch (commandName){
                case "Loot":
                    for (int i = 1; i < commandArguments.length ; i++) {
                        if (!chest.contains(commandArguments[i])){
                            chest.add(0,commandArguments[i]);
                        }
                    }
                    break;
                case"Drop":
                    int index = Integer.parseInt(commandArguments[1]);
                    if (index >= chest.size()|| index < 0){
                        break;
                    }
                    String element = chest.remove(index);
                    chest.add(element);
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArguments[1]);

                    if (count >= chest.size()){
                        String output = (String.join(", ", chest));
                        System.out.println(output);

                        chest.clear();
                        break;
                    }

                    List<String> stolen = new ArrayList<>();

                    for (int i = 0; i < count; i++) {
                        int lastIndex= chest.size() - 1;
                        stolen.add(chest.remove(lastIndex));
                    }

                    Collections.reverse(stolen);

                    String output = (String.join(", ", stolen));
                    System.out.println(output);

                    break;

            }

            command = sc.nextLine();
        }
        if (chest.size() >0){
            double lengthSum = 0;
            for (String s : chest) {
                lengthSum+=s.length();
            }

            System.out.printf("Average treasure gain: %.2f pirate credits.", (lengthSum * 1.0)/chest.size());
        }else{
            System.out.println("Failed treasure hunt.");
        }


    }
}
