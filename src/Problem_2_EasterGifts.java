import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_2_EasterGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> presents = readStringList(sc);
        String command = sc.nextLine();
        while (!"No Money".equals(command)){
            String[]tokens = command.split(" ");
            String operation = tokens[0];
            String gift = tokens[1];

        switch (operation){
            case "OutOfStock":
                for (int i = 0; i < presents.size() ; i++) {
                    if (presents.get(i).equals(gift)){
                        presents.set(i,"None") ;
                    }
                }
                break;
            case "Required":
                int index = Integer.parseInt(tokens[2]);
                if (index >=0 && index < presents.size()){
                    presents.set(index, gift);
                }
                break;
            case "JustInCase":
                presents.set(presents.size()-1,gift);
                break;
        }

            command = sc.nextLine();
        }
        printList(presents);



    }
    private static List<String> readStringList(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<String > list = new ArrayList<>();

        for (String s : split) {
            list.add(s);
        }
        return list;
    }
    private static void printList (List<String> lines){
        for (int i = 0; i < lines.size(); i++) {
            if (!lines.get(i).equals("None")){
                System.out.print(lines.get(i) +" ");
            }
        }
    }
}
