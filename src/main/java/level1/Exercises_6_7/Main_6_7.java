package level1.Exercises_6_7;

import java.util.ArrayList;

public class Main_6_7 {

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

        ListingNumbersAndStrings exercises = new ListingNumbersAndStrings();

        System.out.println(exercises.gettingOnlyStrings(listNumbersAndStrings));
        System.out.println(exercises.gettingOnlyStringsReversed(listNumbersAndStrings));


    }


}
