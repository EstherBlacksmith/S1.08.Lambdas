package level1.Exercises_1_2;

import java.util.ArrayList;
import java.util.List;

public class Main_1_2 {

    final static int FIVE = 5;
    final static String OLOWERCASE = "o";

    public static void main(String[] args) {
        List<String> StringListForManipulation = new ArrayList<>();

        StringListForManipulation.add("Dog");
        StringListForManipulation.add("Cat");
        StringListForManipulation.add("Elephant");
        StringListForManipulation.add("Ferret");
        StringListForManipulation.add("Platypus");
        StringListForManipulation.add("Wombat");
        StringListForManipulation.add("Quokka");

        StringFiltering exercises = new StringFiltering();

        List<String> onlyOList = exercises.containsLetter(StringListForManipulation, OLOWERCASE);
        for (String onlyO : onlyOList) {
            System.out.println(onlyO);
        }

        List<String> onlyOListAndFive = exercises.containsLetterAndMinimumLength(StringListForManipulation, FIVE);
        for (String onlyOAnd5 : onlyOListAndFive) {
            System.out.println(onlyOAnd5);
        }
    }
}

