import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class AsoAraTaskOne {

    public static void main(String[] args) {

        Map<String, Integer> infectedByCity = new TreeMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        while (!command.equals("end")){
            if (command.equals("report")){
                String cityName = sc.next();

                System.out.println(infectedByCity.get(cityName));
            }else {
                int newlyInfected = sc.nextInt();
              //  infectedByCity.putIfAbsent(command,0);

                Integer currentInfected = infectedByCity.get(command);
                if (currentInfected == null){
                    currentInfected = 0;
                }
                infectedByCity.put(command, currentInfected + newlyInfected);
            }
            command = sc.next();
        }
        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        ;


        /*List<String> names = new ArrayList<String>();

        //names.add("Gabrovo");
        int firstDay = 15;
        int secondDay = 30;

       // infectedByCity.put("Gabrovo", firstDay);

       /* Integer current = infectedByCity.get("Gabrovo");
        if (current == null){
            current =0;
        }
        infectedByCity.put("Gabrovo", current+ secondDay);
        infectedByCity.put("Sofia", 42);
        System.out.println(infectedByCity.get("Gabrovo"));*/

    }
}
