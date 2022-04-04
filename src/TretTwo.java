import java.util.Iterator;
import java.util.LinkedList;

public class TretTwo {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<>();
        people.add("Marina" );
        people.add("Louise");
        people.add("Kathrine");
        people.add("Barbara");
        Iterator<String> iterator = people.iterator();
        while(iterator.hasNext()){
            String person = iterator.next();
            if (person.equals(("Louise"))){
                iterator.remove();
            }else{
                System.out.println(person);
            }

        }
    }
}
