import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("Valerevish");
        valera.setEmail("valera@test.com");
        valera.setPhone("+371 70707070");

        Student liga = new Student("Liga", "Ivanova", "liga@test.lv", "+370 20202020");
        Student ivan = new Student("Ivan", "Kusaka", "", "+371 123123123123");
        Student bimo = new Student("BiMO", "Meshkova", "bimo@bimo.lv", "2020220202020");

        List<Student> students = new ArrayList<>();
        students.add((valera));     // 0
        students.add((liga));       // 1
        students.add((ivan));       // 2
        students.add((bimo));       // 3

        //-------------------------------FOR-------------------------------
        for (int i = 0; i < students.size(); i++) {         // i < 2 то же самое, что i <= 1 (i = i + 1)
            System.out.println(students.get(i).getFirstName());
        }

        //-------------------------------FOREACH-------------------------------
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());
        }

        //-------------------------------FOREACH WITH IF-------------------------------
        System.out.println("Students with phone starts with +371");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}
