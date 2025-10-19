package level1.Exercises_6_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListingNumbersAndStrings {

    protected List<String> gettingOnlyStrings(ArrayList<Object> numbersAndStrings) {

        List<String> onlyStrings = numbersAndStrings.stream()
                .filter(os -> os instanceof String)
                .map(oString -> (String) oString)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        return onlyStrings;

    }

    protected List<String> gettingOnlyStringsReversed(ArrayList<Object> numbersAndStrings) {

        List<String> onlyStrings = numbersAndStrings.stream()
                .filter(os -> os instanceof String)
                .map(oString -> (String) oString)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        return onlyStrings;

    }
}
