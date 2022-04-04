import java.util.*;

public class wPlantDiscoveryExPrep {

    static class Plant{
        String name;
        int rarity ;
        List<Double> rating;


        public Plant(String name, int rarity){
            this.name = name;
            this.rarity = rarity;
            this.rating = new ArrayList<>();

        }

        public int getRarity() {
            return rarity;
        }

        public String getName() {
            return name;
        }
        public void addRating (double rating){
            this.rating.add(rating);
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;

        }

        public void resetRating() {
            this.rating.clear();
        }

        public double getAverageRating() {
            if (this.rating.isEmpty()){
                return 0;
            }
            double averageRating = 0;
            for (Double rating : this.rating) {
                averageRating += rating;

            }
            averageRating = averageRating / this.rating.size();
            return  averageRating;
        }
    }
    public static void main(String[] args) {
        Map<String, Plant> plantsByName = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
            Plant p = new Plant(nameAndRarity[0],Integer.parseInt(nameAndRarity[1]));
            plantsByName.put(p.getName(),p);

        }
        String  command = scanner.nextLine();
        while (!command.equals("Exhibition")){
            String[] commandAndParameters =  command.split(": ");
            switch (commandAndParameters[0]){
                case "Rate":{
                    String[] parameters = commandAndParameters[1].split(" - ");
                    String ratePlant = parameters[0];
                    int rating = Integer.parseInt(parameters[1]);

                    Plant ratePlants = plantsByName.get(ratePlant);
                    if (ratePlants != null ){
                        ratePlants.addRating(rating);
                    }else System.out.println("error");

                    break;}
                case "Update":{
                    String[] parameters = commandAndParameters[1].split(" - ");
                    String updatePlantName = parameters[0];
                    int rating = Integer.parseInt(parameters[1]);

                    Plant ratePlants = plantsByName.get(updatePlantName);
                    if (ratePlants != null ){
                        plantsByName.get(updatePlantName).setRarity(rating);
                    }else System.out.println("error");


                    break;}
                case "Reset":{
                    String[] parameters = commandAndParameters[1].split(" - ");
                    String ratePlant = parameters[0];

                    Plant ratePlants = plantsByName.get(ratePlant);
                    if (ratePlants != null ){
                        plantsByName.get(ratePlant).resetRating();
                    }else System.out.println("error");


                    break;}
                default:
                    System.out.println("error");
            }


            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition: ");


        plantsByName.values()
                .stream()
                .sorted((a, b) -> {
            if (a.getRarity() != b.getRarity()){
               return Integer.compare(b.getRarity(), a.getRarity());
            }else{
                return Double.compare(b.getAverageRating(), a.getAverageRating());

            }
        })
                .map(p -> "- " +  p.getName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format("%.2f",p.getAverageRating() ) )
                .forEach(s -> System.out.println(s));



    }
}
