import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class yOneExProbl {
    public static <Char> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String email = "";
        email = scanner.nextLine();


        String input = scanner.nextLine();
        while (!input.equals("Valid")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Validation":


                    if (email.length() < 6) {
                        System.out.println("Email must be at least 6 characters long!");
                    } else {
                        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
                        Matcher m = p.matcher(email);
                        boolean b = m.find();
                        if (b) {
                            if (email.contains("@")) {
                                System.out.println("Email must consist at least one digit!");
                                break;
                            }
                            System.out.println("Email must consist only of letters, digits and @!");
                            break;
                        }
                        Pattern pp = Pattern.compile("(?=.*[A-Z])");//check upper case letter
                        Matcher mm = pp.matcher(email);
                        boolean bb = m.find();
                        if (!bb) {
                            System.out.println("Email must consist at least one uppercase letter!");
                            break;
                        }
                        Pattern pLow = Pattern.compile("(?=.*[a-z])");//check lower case letter
                        Matcher mLow = pLow.matcher(email);
                        boolean bLow = m.find();
                        if (!bLow) {
                            System.out.println("Email must consist at least one lowercase letter!");
                            break;
                        }
                        Pattern pDig = Pattern.compile("([\\d])");//check digits
                        Matcher mDig = pDig.matcher(email);
                        boolean bDig = m.find();
                        if (!bDig) {
                            System.out.println("Email must consist at least one digit!");

                        }
                    }


                    break;

                case "Insert":

                    int indexIns = Integer.parseInt(tokens[1]);
                    if (indexIns > 0 && indexIns <= email.length()) {


                        String insString = tokens[2].toString();

                        StringBuilder insToEmail = new StringBuilder(email);
                        insToEmail.insert(indexIns, insString);

                        email = insToEmail.toString();
                    }
                    System.out.println(email);
                    break;
                case "Change":

                    int substitute = Integer.parseInt(tokens[2]);
                    char[] c = (tokens[1]).toCharArray();
                    char chh = tokens[1].charAt(0);
                    int chValue = c[0];
                    int sum = chValue + substitute;
                    char replace = (char) sum;
                    String replaceMe = Character.toString(replace);

                    String cEmail = email.replaceAll(Character.toString(chh), replaceMe);


                    email = cEmail;
                    System.out.println(email);
                    break;


                case "Upper":
                    int upIndex = Integer.parseInt(tokens[1]);
                    if (upIndex > 0 && upIndex <= email.length()) {

                        //  char[] c = email.toCharArray();
                        //   c[upIndex]          = Character.toUpperCase(c[upIndex]);
                        //  email = new String(c);}
                        System.out.println(email);
                        break;
              /*  case "Lower":

                    int lowIndex = Integer.parseInt(tokens[1]);
                    if (lowIndex > 0 && lowIndex <= email.length()){
                        char[] ch = email.toCharArray();
                        ch[lowIndex]          = Character.toLowerCase(ch[lowIndex]);
                        email = new String(ch);}
                    System.out.println(email);
                    break;*/
                        //  default:
                        //   break;
                    }

            }


            input = scanner.nextLine();
            System.out.println(email);

        }

    }
    }


