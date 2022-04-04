import java.math.BigInteger;
import java.util.Scanner;

public class a03_lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger factorial = new BigInteger("1");

        for (int i = 2; i <= n ; i++) {
            BigInteger multiplier = new BigInteger(""+ i);
            factorial = factorial.multiply(multiplier);
        }

        System.out.println(factorial);

    }
}
