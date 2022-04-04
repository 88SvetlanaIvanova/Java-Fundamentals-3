import java.util.Scanner;

public class MidExamCooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double flourPrice = Double.parseDouble(sc.nextLine());
        double singleEggPrice =  Double.parseDouble(sc.nextLine());
        double apronPrice =  Double.parseDouble(sc.nextLine());

        double eggs = singleEggPrice * 10;
        double expences = 0;
        if (students % 5 == 0){
            int freeFlour = students/5;

            expences = apronPrice * Math.ceil(students + (students*0.2)) + (eggs * students) + (flourPrice * (students-freeFlour));

        }else
            expences = apronPrice * Math.ceil(students + (students*0.2)) + (eggs * students) + (flourPrice * (students));
        //System.out.println(expences);

        if (expences <= budget){
            System.out.printf("Items purchased for %.2f$.", expences);
        }else{
            double needed =expences-budget;
            System.out.printf("%.2f$ more needed.", needed);
        }

    }
}
