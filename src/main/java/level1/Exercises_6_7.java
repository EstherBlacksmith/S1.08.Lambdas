package level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises_6_7 {
    public static void main(String[] args) {
        ArrayList<Object> listNumbersAndStrings = new ArrayList<>();

        listNumbersAndStrings.add("Dog");
        listNumbersAndStrings.add("Cat");
        listNumbersAndStrings.add(4);
        listNumbersAndStrings.add(100);
        listNumbersAndStrings.add(-10);
        listNumbersAndStrings.add("Elephant");
        listNumbersAndStrings.add("Ferret");
        listNumbersAndStrings.add(8);
        listNumbersAndStrings.add("Platypus");
        listNumbersAndStrings.add("Wombat");
        listNumbersAndStrings.add("Quokka");

        System.out.println(exercise6(listNumbersAndStrings));

    }

    private static List<String> exercise6(ArrayList<Object> numbersAndStrings) {

        List<String> onlyStrings = numbersAndStrings.stream()
                .filter(os -> os instanceof String)
                .map(oString -> (String) oString)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        return onlyStrings;

    }
}
