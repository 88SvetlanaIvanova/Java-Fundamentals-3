import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Man_O_War {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] blackPearl = sc.nextLine().split(">");
        List<Integer> blackPearlSections = new ArrayList<>();

        for (int i = 0; i < blackPearl.length ; i++) {
            int section = Integer.parseInt(blackPearl[i]);
            blackPearlSections.add(section);
        }

        String[] warShip = sc.nextLine().split(">");
        List<Integer> warShipSections = new ArrayList<>();

        for (int i = 0; i < warShip.length ; i++) {
            int section = Integer.parseInt(warShip[i]);
            warShipSections.add(section);
        }
        int maxHealth = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();

        while(!command.equals("Retire")){
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Fire":
                    int sectionIndex = Integer.parseInt(commandParts[1]);
                    int damage = Integer.parseInt(commandParts[2]);
                    if(sectionIndex < 0 || sectionIndex >= warShipSections.size() ){
                        break;
                    }

                    Integer sectionHealth = warShipSections.get(sectionIndex);
                    sectionHealth -= damage;

                    if (sectionHealth <= 0 ){
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }

                    warShipSections.set(sectionIndex,sectionHealth);

                    break;

                case "Defend":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    int damageDealt = Integer.parseInt(commandParts[3]);

                    if (startIndex < 0 || startIndex >= blackPearlSections.size()-1){
                        break;
                    }
                    if(endIndex < 0 || endIndex >= blackPearlSections.size()){
                        break;
                    }

                    for (int i = startIndex; i <= endIndex ; i++) {
                        int health = blackPearlSections.get(i);
                        health -= damageDealt;

                        if (health<=0){
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                        blackPearlSections.set(i, health);
                    }

                    break;
                case "Repair":

                    int index = Integer.parseInt(commandParts[1]);
                    int repairHealth = Integer.parseInt(commandParts[2]);
                    if(index < 0 || index >= blackPearlSections.size() ){
                        break;
                    }

                    Integer section = blackPearlSections.get(index);
                    section += repairHealth;

                    if (section > maxHealth){
                        section = maxHealth;
                    }

                    blackPearlSections.set(index, section);

                    break;
                case "Status":
                    int count =0;
                    double threshold = maxHealth * 0.2;
                    for (Integer blackPearlSection : blackPearlSections) {
                        if (blackPearlSection < threshold){
                            count++;
                        }

                    }

                    System.out.println(count + " sections need repair.");
                    break;
            }
            command = sc.nextLine();
        }
        int pirateSum = 0;

        for (Integer blackPearlSection : blackPearlSections) {
            pirateSum += blackPearlSection;
        }
        int warShipSum = warShipSections.stream().mapToInt(a -> a).sum();

        System.out.printf("Pirate ship status: %d%nWarship status: %d", pirateSum,warShipSum);


    }
}
