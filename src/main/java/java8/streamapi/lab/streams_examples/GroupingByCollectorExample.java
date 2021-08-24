package java8.streamapi.lab.streams_examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class GroupingByCollectorExample {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                Employee.builder().name("Lena").salary(10).build(),
                Employee.builder().name("Vasya").salary(10).build(),
                Employee.builder().name("Masha").salary(12).build(),
                Employee.builder().name("Petya").salary(12).build(),
                Employee.builder().name("Kolya").salary(9).build()
        );
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
        System.out.println(map);
    }
}
