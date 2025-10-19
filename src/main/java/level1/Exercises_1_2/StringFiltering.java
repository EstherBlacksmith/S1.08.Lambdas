package level1.Exercises_1_2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFiltering {

    protected List<String> containsLetter(List<String> StringListForManipulation, String letterContains) {
        List<String> StringListOnlyO = null;
        StringListOnlyO = StringListForManipulation.stream()
                .filter(stringList -> stringList.contains(letterContains)).collect(Collectors.toList());
        return StringListOnlyO;

    }

    protected List<String> containsLetterAndMinimumLength(List<String> StringListForManipulation, int minimumLength) {
        List<String> StringListOnlyO = null;
        Predicate<String> OnlyOes = stringList -> stringList.contains("o");
        Predicate<String> minLength5 = stringList -> stringList.length() >= minimumLength;

        StringListOnlyO = StringListForManipulation.stream()
                .filter(OnlyOes.and(minLength5)).collect(Collectors.toList());
        return StringListOnlyO;

    }
}
