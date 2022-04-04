package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while(!input.equals("end")){

            String[] studentParts = input.split(" ");

            int age = Integer.parseInt(studentParts[2]);

            Student student = new Student(studentParts[0], studentParts[1],age,  studentParts[3]);

            students.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);

            if (current.getHomeTown().equals(city)){
                //print
                System.out.println(current.getString());
            }
        }

       // students.stream()
        //        .filter(s -> s.getHomeTown().equals(city))
        //        .forEach(s -> System.out.println(s.getString()));
    }



}
