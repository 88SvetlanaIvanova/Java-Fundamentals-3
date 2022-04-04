import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class p2Archery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] field = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();
        int point = 0;
        while (!(command.equals("Game over"))) {

            if (command.equals("Reverse")) {
                int len = field.length - 1;
                for (int i = 0; i < field.length / 2; i++) {
                    String current = field[i];
                    field[i] = field[len];
                    field[len] = current;
                    len--;
                }
            } else {
                String[] firstSplit = command.split(" ");
                String[] secondSplit = firstSplit[1].split("@");
                String direction = secondSplit[0];
                int startIndex = Integer.parseInt(secondSplit[1]);
                int step = Integer.parseInt(secondSplit[2]);

                if (startIndex >= 0 && startIndex < field.length) {
                    if (field.length < step) {
                        step = step % field.length;
                    }
                    if (direction.equals("Right")) {
                        for (int i = 0; i < step; i++) {
                            startIndex++;
                            if (startIndex >= field.length) {
                                startIndex = 0;
                            }
                        }
                        if (Integer.parseInt(field[startIndex]) >= 5) {
                            field[startIndex] = String.valueOf(Integer.parseInt(field[startIndex]) - 5);
                            point += 5;
                        }
                        if (Integer.parseInt(field[startIndex]) < 5) {
                            point += Integer.parseInt(field[startIndex]);
                            field[startIndex] = "0";
                        }
                    }
                    if (direction.equals("Left")) {
                        for (int i = 0; i < step; i++) {
                            startIndex--;
                            if (startIndex < 0) {
                                startIndex = field.length - 1;
                            }
                        }
                        if (Integer.parseInt(field[startIndex]) >= 5) {
                            field[startIndex] = String.valueOf(Integer.parseInt(field[startIndex]) - 5);
                            point += 5;
                        }
                        if (Integer.parseInt(field[startIndex]) < 5) {
                            point += Integer.parseInt(field[startIndex]);
                            field[startIndex] = "0";
                        }
                    }

                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" - ", field));
        System.out.printf("Iskren finished the archery tournament with %d points!", point);

    }
}
