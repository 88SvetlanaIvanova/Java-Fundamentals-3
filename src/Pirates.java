import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int plunderPerDay = Integer.parseInt(sc.nextLine());
        double targetPlunder = Double.parseDouble(sc.nextLine());

        double totalPlunder = 0;

        for (int i = 1; i <= days ; i++) {
            totalPlunder += plunderPerDay;
            if (i % 3 == 0){
                totalPlunder+=plunderPerDay* 0.5;
            }
            if (i % 5 == 0){
                totalPlunder-=totalPlunder*0.3;
            }
        }
        if ( totalPlunder >= targetPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        }else{
            double collectedPercentage = (totalPlunder/targetPlunder)*100;
            System.out.printf("Collected only %.2f%% of the plunder.",collectedPercentage );
        }
    }
}
