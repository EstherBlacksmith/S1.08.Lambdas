package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReturningManipulatedStrings {

    protected List<String> startWithAndTotalLetters(ArrayList<String> namesString, String containsLetter, int totalLetters) {
        Predicate<String> startIngA = stringList -> stringList.contains(containsLetter);
        Predicate<String> totalLength = stringList -> stringList.length() == totalLetters;

        List<String> onlyStrings = namesString.stream()
                .filter(startIngA.and(totalLength))
                .collect(Collectors.toList());
        return onlyStrings;

    }

    protected String separatedByComma(List<Integer> integerList){
        String commaSeparatedValues;
        commaSeparatedValues = integerList.stream()
                .map(integer -> ((integer % 2== 0 ? "e" + integer : "o" + integer ) ))
                        .collect(Collectors.toList()).toString();

        return commaSeparatedValues;
    }
}
