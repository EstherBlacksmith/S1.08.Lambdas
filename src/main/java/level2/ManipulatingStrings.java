package level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ManipulatingStrings {

    protected List<String> startWithAndTotalLetters(ArrayList<String> namesString, String containsLetter, int totalLetters) {
        Predicate<String> startIngA = stringList -> stringList.contains(containsLetter);
        Predicate<String> totalLength = stringList -> stringList.length() == totalLetters;

        List<String> onlyStrings = namesString.stream()
                .filter(startIngA.and(totalLength))
                .collect(Collectors.toList());
        return onlyStrings;

    }

    protected String separatedByComma(List<Integer> integerList) {
        String commaSeparatedValues;
        commaSeparatedValues = integerList.stream()
                .map(integer -> ((integer % 2 == 0 ? "e" + integer : "o" + integer)))
                .collect(Collectors.toList()).toString();

        return commaSeparatedValues;
    }

    protected Stream<String> OrderingPhonetically(ArrayList<Object> listNumbersAndStrings) {

        Stream<String> phoneticallyOrdered = listNumbersAndStrings.stream()
                .filter(os -> os instanceof String)
                .map(oString -> (String) oString)
                .sorted(Comparator.comparing(os -> os.charAt(0)));

        return phoneticallyOrdered;
    }


}
