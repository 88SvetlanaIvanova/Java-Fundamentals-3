import java.util.Scanner;

public class worldTourExPrep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder allStops = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();

        while(!"Travel".equals(input)){
            String[] command = input.split(":");
            String singleCommand = command[0];
            switch (singleCommand) {
                case "Add Stop":
                    int insertIndex = Integer.parseInt(command[1]);
                    String insertString = command[2];
                    if (isValidIndex(insertIndex, allStops)){
                    allStops.insert(insertIndex, insertString);}
                    break;
                case "Remove Stop":
                    int fromIndex = Integer.parseInt(command[1]);
                    int toIndex = Integer.parseInt(command[2]);
                    if (isValidIndex(fromIndex, allStops)&&(isValidIndex(toIndex, allStops))){
                    allStops.replace(fromIndex, toIndex + 1 , "");
                }


                    break;
                case "Switch":
                    String oldString = command[1];
                    String newString = command[2];

                    allStops = new StringBuilder( allStops.toString().replace(oldString, newString));

                    break;
                default:
                    System.out.println("Unknown command: " + singleCommand);



            }
            System.out.println(allStops);
            input = sc.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: "+ allStops);
    }
    static boolean isValidIndex(int index, StringBuilder s){
        return index >= 0 && index < s.length();
    }

}
