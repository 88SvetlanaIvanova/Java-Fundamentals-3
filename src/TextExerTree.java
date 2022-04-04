import java.util.Scanner;

public class TextExerTree {
    public static void main(String[] args) {
        //3.	Substring
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String result = "";
         int indexCheckIfContains = two.indexOf(one,0);
        while(indexCheckIfContains!=-1){
           two = two.replaceAll(one, "");

         indexCheckIfContains = two.indexOf(one, 0);
        }
        System.out.println(two);


    }
}
