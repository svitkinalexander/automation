/*Задача 62. Stream API. Студенты
        Создать коллекцию из 10 студентов;
        преобразовать коллекцию в поток;
        вывести на консоль студентов, фамилия которых начинается на "А".*/

package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task62 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        Collections.addAll(students, "Svitkin", "Trofimenkov", "Abramov", "Astafiev");
        List<String> filteredStudents = students.stream()
                .filter(p -> p.charAt(0) == 'A')
                .collect(Collectors.toList());
        for (String s: filteredStudents) {
            System.out.println(s);
        }
    }
}
