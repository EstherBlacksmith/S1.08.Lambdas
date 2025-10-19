package level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {
    private static final int THREE = 3;

    public static void main(String[] args) {
        ArrayList<String> namesString =  new ArrayList<>();
        namesString.add("Pepe");
        namesString.add("Pepa");
        namesString.add("Ana");
        namesString.add("Avelina");
        namesString.add("Ares");
        namesString.add("Aro");
        System.out.println(exercise1(namesString));
    }

    private static List<String> exercise1(ArrayList<String> namesString) {
        Predicate<String> startIngA = stringList -> stringList.contains("A");
        Predicate <String> totalLength = stringList -> stringList.length() == THREE;

        List<String> onlyStrings = namesString.stream()
                .filter(startIngA.and(totalLength))
                .collect(Collectors.toList());
        return onlyStrings;

    }
}
