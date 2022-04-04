import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PRACTICE1ONE {
    public static void main(String[] args) {
        Map<String, Integer> infectedByCity = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String  command = scanner.next();
        while (!command.equals("end")){
            if (command.equals("report")){
                String cityName = scanner.next();
                System.out.println(infectedByCity.get(cityName));

            }else{
                int newlyInfected = scanner.nextInt();

                Integer currentInfected = infectedByCity.get(command);
                if (currentInfected == null){
                    currentInfected = 0;
                }
                infectedByCity.put(command, currentInfected + newlyInfected);
            }

            command = scanner.next();
        }


    }
}
