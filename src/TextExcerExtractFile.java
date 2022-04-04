import java.util.Scanner;

public class TextExcerExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String file = path.substring(path.lastIndexOf("\\")+1);
        String name = file.substring(0, file.indexOf("."));
        String extention = file.substring(file.indexOf(".") + 1);
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extention);
    }
}
