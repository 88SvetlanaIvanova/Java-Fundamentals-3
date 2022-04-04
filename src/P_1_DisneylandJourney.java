import java.util.Scanner;

public class P_1_DisneylandJourney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double journeyCost = Double.parseDouble(sc.nextLine());
        int numberOfMonth = Integer.parseInt(sc.nextLine());
        double savedSum = 0;
        for (int i = 1; i <= numberOfMonth ; i++) {

            if (i > 1 && i % 2 !=0){
                savedSum -= savedSum * 0.16;
            }
            if (i % 4 == 0){
                savedSum+= savedSum*0.25;
            }
            savedSum += journeyCost * 0.25;
        }
        double souvenirs = savedSum - journeyCost;
        if (savedSum >= journeyCost){
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", souvenirs);
        }else{
            double neededMoney = journeyCost - savedSum;
            System.out.printf("Sorry. You need %.2flv. more.", neededMoney);
        }
    }
}
