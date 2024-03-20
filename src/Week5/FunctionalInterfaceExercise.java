package Week5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceExercise {

    public static void main(String[] args) {
        String[] array = {"Mary", "Maryam", "Mitchell", "Mimi", "Margaret", "Emily", "Monster"};
        List<String> list = new ArrayList<>(List.of(array));

        list.stream()
                .filter(element -> element.length() <= 5)
                .map(element -> {
                        String upperCase = element.toUpperCase();
                        System.out.println(upperCase);
                        return upperCase;
                })
                .filter(upperCaseElement -> upperCaseElement.startsWith("Ma"))
                .sorted((e1, e2) -> e2.compareTo(e1))
                .forEach(System.out::println);


    }
}
