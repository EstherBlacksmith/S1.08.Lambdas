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

    protected List<String> OrderingPhonetically(ArrayList<Object> listNumbersAndStrings) {

        List<String> phoneticallyOrdered = listNumbersAndStrings.stream()
                .map(Object::toString)
                .sorted(Comparator.comparingInt(oString -> oString.charAt(0)))
                .collect(Collectors.toList());

        return phoneticallyOrdered;
    }

    protected Stream<String> OrderingByContainingLetter(ArrayList<Object> listNumbersAndStrings, String containingLetter) {

        Stream<String> phoneticallyOrdered = listNumbersAndStrings.stream()
                .map(Object::toString)
                .sorted((oString1,oString2)-> {
                   boolean e1=  oString1.contains("e") ;
                   boolean e2=  oString2.contains("e") ;

                   if (e1 && !e2) return -1;
                   if (!e1 && e2) return 1;

                   return Character.compare(oString1.charAt(0), oString2.charAt(0));


                });
           //     .map(oString -> (String) oString)
             //   .sorted(Comparator.comparingInt(a -> (a.contains(containingLetter.toLowerCase()) || a.contains(containingLetter.toUpperCase()) ? 0 : 1)));


        return phoneticallyOrdered;
    }


}
