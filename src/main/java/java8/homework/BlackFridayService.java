package java8.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BlackFridayService {

    public static void printBlackFridayPerYearSorted(int startYear, int endYear) {

        LocalDate startDate = LocalDate.of(startYear,1,1);
        LocalDate endDate = LocalDate.of(endYear,12,31);

        Stream<LocalDate> dates = startDate.datesUntil(endDate);

        dates.filter(e -> e.getDayOfMonth() ==13)
                .filter(e -> e.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear,Collectors.counting()))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer,Long>::getValue).reversed())
                .forEach(System.out::println);

    }

    public static void main(String[] args){
        printBlackFridayPerYearSorted(1901,2001);

    }


}
