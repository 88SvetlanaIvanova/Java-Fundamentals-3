import java.util.List;
import java.util.Scanner;

public class Problem1CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int energy = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();
        int battleCount = 0;
        while(!command.equals("End of battle")&& energy > 0){
            int distance = Integer.parseInt(command);

                energy -= distance;
                battleCount++;
            if(energy < distance){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battleCount, energy);
                return;
            }
            if(battleCount % 3 == 0){
                energy+=battleCount;
            }

            command = sc.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", battleCount, energy);


    }

}
