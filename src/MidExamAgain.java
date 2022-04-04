import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExamAgain {
    public static void main(String[] args) { // Problem Deck of Cards
        Scanner scanner= new Scanner(System.in);
        String values1 = scanner.nextLine();
        List<String> ownedCards = Arrays.stream(values1.split(", ")).collect(Collectors.toList());



        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <num ; i++) {

            String commandInp = scanner.nextLine().toString();
            String[] inputComands = commandInp.replace(",", " ").split("  ");
            String command = inputComands[0];


            switch (command){
                case "Add":
                    String cardName = inputComands[1];
                    for (int k = 0; k < ownedCards.size() ; k++) {
                        if (ownedCards.contains(cardName)){
                            System.out.println("Card is already bought");
                        }else{
                            System.out.println("Card successfully bought");
                            ownedCards.add(cardName);
                        }
                        break;
                    }
                    break;
                case "Remove":
                    for (int j = 0; j < ownedCards.size() ; j++) {
                        String removedCard = inputComands[1];
                        if (ownedCards.contains(removedCard)){
                            System.out.println("Card successfully sold");
                            ownedCards.remove(j);
                        }else{
                            System.out.println("Card not found");
                        }
                        break;
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(inputComands[2]);
                    if (index< ownedCards.size()){
                        ownedCards.remove(index);
                        System.out.println("Card successfully sold");
                    }else{
                        System.out.println("Index out of range");
                        continue;
                    }
                    break;
                case "Insert":
                    int indexCard = Integer.parseInt(inputComands[1]);
                    String newCard = inputComands[2];
                    if (indexCard < ownedCards.size() ) {
                        for (int j = 0; j < ownedCards.size(); j++) {
                            if (ownedCards.contains(newCard)) {
                                System.out.println("Card is already bought");
                            } else {

                                ownedCards.add(indexCard,newCard);
                                System.out.println("Card successfully bought");
                            }
                            break;
                        }
                    }else{
                        System.out.println("Index out of range");
                    }
                    break;
            }




        }

        System.out.println(String.join(", ", ownedCards));
    }
        }



