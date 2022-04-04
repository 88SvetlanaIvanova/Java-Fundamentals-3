import java.util.*;

public class projectOneJet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> list = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            String[] split = scanner.nextLine().split("\\s+");


            for (String s : split) {
                list.push(s);
            }
        }
        System.out.println();
        for (String s : list) {

            System.out.println(String.format(list.poll()));
        }


    }
}
