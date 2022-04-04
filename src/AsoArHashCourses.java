import java.util.*;

public class AsoArHashCourses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while(!input.equals("end")){
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String student = tokens[1];
             if (!courses.containsKey(courseName)){
                   courses.put(courseName, new LinkedList<>());

             }
             courses.get(courseName).add(student);




            input = sc.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((f,s) -> s.getValue().size() - f.getValue().size())
                .forEach(e ->{
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted((f,s) -> f.compareTo(s))
                            .forEach(s -> System.out.println("-- " +s));

                });

    }
}

