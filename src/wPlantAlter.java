import java.util.*;

public class wPlantAlter {
    public static void main(String[] args) {
       // Map<String, wPlantDiscoveryExPrep.Plant> plantsByName = new HashMap<>();

        Map<String, Integer> plantRareByName = new HashMap<>();

        Map<String, List<Integer>> plantListOfRatingsByName = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");

            String plantName = nameAndRarity[0];

            plantRareByName.put(plantName, Integer.parseInt(nameAndRarity[1]));
            plantListOfRatingsByName.put(plantName, new ArrayList<>());
        }

            String  command = scanner.nextLine();


            while (!command.equals("Exhibition")){
                String[] commandAndParameters =  command.split(": ");
                switch (commandAndParameters[0]){
                    case "Rate":{
                        String[] parameters = commandAndParameters[1].split(" - ");
                        String ratePlant = parameters[0];
                        int rating = Integer.parseInt(parameters[1]);


                        List<Integer> ratings = plantListOfRatingsByName.get(ratePlant);
                        if (ratings != null ){
                            ratings.add(rating);
                        }else System.out.println("error");

                        break;}
                    case "Update":{
                        String[] parameters = commandAndParameters[1].split(" - ");
                        String updatePlantName = parameters[0];
                        int rating = Integer.parseInt(parameters[1]);


                        if (plantRareByName.containsKey(updatePlantName)){
                            plantRareByName.put(updatePlantName, rating);
                        }else System.out.println("error");


                        break;}
                    case "Reset":{
                        String parameters = commandAndParameters[1];

                        List<Integer> resetRatings = plantListOfRatingsByName.get(parameters);
                        if (resetRatings != null ){
                            resetRatings.clear();
                        }else System.out.println("error");

                        break;}
                    default:
                        System.out.println("error");
                }


                command = scanner.nextLine();
            }
            System.out.println("Plants for the exhibition: ");


        plantRareByName.entrySet().stream()
                .sorted((a,b) -> {
                    int aRarity = a.getValue();
                    int bRarity = b.getValue();

                    if (aRarity != bRarity){
                        return Integer.compare(bRarity, aRarity);

                    }     else{

                        List<Integer> aRatingsList = plantListOfRatingsByName.get(a.getKey());
                        List<Integer> bRatingsList = plantListOfRatingsByName.get(b.getKey());
                        double aAverage = calculateAverage(aRatingsList);
                        double bAverage = calculateAverage(bRatingsList);
                        return Double.compare(bAverage, aAverage);
                    }
                })

                .map(entry -> "- " +  entry.getKey() + "; Rarity: " + entry.getValue() + "; Rating: " + String.format("%.2f",(calculateAverage(plantListOfRatingsByName.get(entry.getKey())))))
                .forEach(s -> System.out.println(s));

    }

    static  double calculateAverage (List<Integer> numbers){
        if (numbers.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Integer number : numbers){
            sum += number;
        }

        return  (sum / numbers.size());
    }
    }


