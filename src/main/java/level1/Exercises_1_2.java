package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises_1_2 {
    public static void main(String[] args) {
        List<String> StringListForManipulation = new ArrayList<>();

        StringListForManipulation.add("Dog");
        StringListForManipulation.add("Cat");
        StringListForManipulation.add("Elephant");
        StringListForManipulation.add("Ferret");
        StringListForManipulation.add("Platypus");
        StringListForManipulation.add("Wombat");
        StringListForManipulation.add("Quokka");

        List<String> onlyOList = exercise1(StringListForManipulation);
        for (String onlyO : onlyOList) {
            System.out.println(onlyO);
        }
    }

    private static List<String> exercise1(List<String> StringListForManipulation) {
        List<String> StringListOnlyO = null;
        StringListOnlyO = StringListForManipulation.stream()
                .filter(stringList -> stringList.contains("o")).collect(Collectors.toList());
        return StringListOnlyO;

    }
}
