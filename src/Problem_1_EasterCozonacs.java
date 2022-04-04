import java.util.Scanner;

public class Problem_1_EasterCozonacs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        double kgFlourPrice = Double.parseDouble(sc.nextLine());
        int coloredEggs = 0;

        double eggPackPrice = 0.75 * kgFlourPrice;
        double milkPrice = (kgFlourPrice* 1.25)/4;
        double cozonacsPrice = eggPackPrice + kgFlourPrice + milkPrice;
        int cozonacsMade = (int) (budget/cozonacsPrice);
        double moneyLeft = budget - (cozonacsPrice * cozonacsMade);


        for (int currentCozonacsCount = 1; currentCozonacsCount <= cozonacsMade ; currentCozonacsCount++) {
            coloredEggs += 3;
            if (currentCozonacsCount % 3 == 0){
                coloredEggs -= (currentCozonacsCount - 2);
            }
        }
        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",cozonacsMade, coloredEggs,moneyLeft);


    }
}
