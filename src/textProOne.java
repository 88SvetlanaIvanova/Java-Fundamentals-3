import java.util.ArrayList;
import java.util.List;

public class textProOne {
    public static void main(String[] args) {
         String word = "abc";
         String text = "eleabccabctionabcs";

         int nextWordIndex = text.indexOf(word, 0);
         String result = text;
         while (nextWordIndex != -1){
             int currentIndex = 0;
             List<String> substrings = new ArrayList<>();
             while (nextWordIndex != -1){
                 substrings.add(result.substring(currentIndex, nextWordIndex));
                 currentIndex = nextWordIndex + word.length();
                 //nextWordIndex = teskt nameri indeksa na dumata ot currentIndex natatyk
                 nextWordIndex = result.indexOf(word, currentIndex);
             }
             substrings.add(result.substring(currentIndex));
             result = String.join("", substrings);
             nextWordIndex = result.indexOf(word, 0);
         }


                //text.substring(currentIndex));

        //System.out.println(text.substring(currentIndex, nextWordIndex));

        System.out.println(result);


    }
}
