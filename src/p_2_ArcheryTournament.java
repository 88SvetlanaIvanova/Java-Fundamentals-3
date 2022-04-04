import java.util.*;

public class p_2_ArcheryTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> targets = readListInteger(sc);
        String input = sc.nextLine();
        int collectedPoins = 0;
        int index =0;
        int length = 0;
        while (!"Game over".equals(input)) {
            String[] tokens = input.split("\\@");
            String command = tokens[0];

            switch (command){
                case "Shoot Left":
                     index = Integer.parseInt(tokens[1]);
                     length = Integer.parseInt(tokens[2]);
                   // if the index is valid
                    if (index >= 0 && index < targets.size()){

                        // while we are going to the target index
                        if (targets.size() < length) {
                            length = length % targets.size();
                        }

                        for (int i = 0; i < length; i++) {
                            index--;
                            if (index < 0 ){
                                index = targets.size() -1;
                            }
                        }
                        if (targets.get(index) >= 5 ) // if there is enough points
                        {
                            targets.set(index,(targets.get(index)-5))  ;
                            collectedPoins += 5;
                        }
                        else if(index < 5)//there is not enough points
                        {
                            collectedPoins += targets.get(index);
                            targets.set(index, 0);

                        }

                    }

                     break;
                case "Shoot Right":
                     int indexRight = Integer.parseInt(tokens[1]);
                     int lengthRight = Integer.parseInt(tokens[2]);
                    if (indexRight >= 0 && indexRight < targets.size() )// if the index is valid
                    {
                        if (targets.size() < lengthRight) {
                            lengthRight = lengthRight % targets.size();
                        }
                        for (int i = 0; i < lengthRight ; i++) {
                            indexRight++;
                            if (indexRight >= targets.size()){
                                indexRight=0;
                            }
                        }
                        if (targets.get(indexRight) >= 5){
                            targets.set(indexRight, targets.get(indexRight)-5);
                            collectedPoins +=5;
                        }else{
                            collectedPoins += targets.get(indexRight);
                            targets.set(indexRight, 0);
                        }
                    }
                    break;


                case "Reverse":
                    Collections.reverse(targets);

                    break;

            }
            input = sc.nextLine();

        }
        printList(targets);
        System.out.printf("%nIskren finished the archery tournament with %d points!",collectedPoins );

    }
    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\|");
        List<Integer> numbers = new ArrayList<>();

        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

    private static void printList (List<Integer> lines){
        for (int i = 0; i < lines.size(); i++) {
           if (i < lines.size() -1){
               System.out.print(lines.get(i) +" - ");
           }else{
               System.out.print(lines.get(i));
           }


        }
    }
}
