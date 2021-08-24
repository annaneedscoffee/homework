package java8.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static List<String> sortedList (List<Employee> employees){
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }


    public static void main(String[] args){


    };
}
