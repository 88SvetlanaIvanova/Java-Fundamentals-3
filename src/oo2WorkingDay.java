import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class oo2WorkingDay {
    public static void main(String[] args) {
       // First, read from the console the array length
        Scanner sc = new Scanner(System.in);
       /* int n = Integer.parseInt(sc.nextLine());

      //Next, create a list of given size n and read its elements

        List<Integer> List = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            List.add(number);
        }*/
      //Lists can be read from a single line of space separated values:
     String values = sc.nextLine();
        List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < items.size() ; i++) {
            nums.add(Integer.parseInt(items.get(i)));

        }
       // List<Integer> items = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    }

}
