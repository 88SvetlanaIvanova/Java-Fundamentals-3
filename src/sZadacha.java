import java.util.Scanner;

public class sZadacha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
       // StringBuilder sb = new StringBuilder();



        String command = scanner.nextLine();
        while (!command.equals("Done")){
        String[] tokens = command.split("\\s+");
         switch (tokens[0]){
             case "TakeOdd":
                 String newPassword = "";
                 for (int i = 1; i < password.length(); i+=2) {
                     newPassword += password.charAt(i);


                 }
                 password = newPassword;
                 System.out.println(password);

                 break;
             case "Cut":
                 int index = Integer.parseInt(tokens[1]);
                 int length = Integer.parseInt(tokens[2]);

                 String first = password.substring(0, index);
                 String second = password.substring(index + length);
                 password = first + second;
                 System.out.println(password);

                 break;
             case "Substitute":
                 String subString = tokens[1];
                 String substitute = tokens[2];
                  if(password.contains(subString)){
                     password = password.replace(subString, substitute);
                     System.out.println(password);
                 }else System.out.println("Nothing to replace!");
                 break;
         }


            command = scanner.nextLine();
        }
        System.out.printf("Your password is %s", password);
    }
}
