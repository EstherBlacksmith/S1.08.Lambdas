package level2;

import java.util.ArrayList;
import java.util.List;

public class Main_1_2 {
    private static final int THREE = 3;
    private static final String AUPPERCASE = "A";

    public static void main(String[] args) {
        ArrayList<String> namesString = new ArrayList<>();
        namesString.add("Pepe");
        namesString.add("Pepa");
        namesString.add("Ana");
        namesString.add("ana");
        namesString.add("Avelina");
        namesString.add("Ares");
        namesString.add("Aro");

        ReturningManipulatedStrings exercises = new ReturningManipulatedStrings();
        System.out.println(exercises.startWithAndTotalLetters(namesString, AUPPERCASE, THREE));

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add( (int)(Math.random() * 11));
        }

        System.out.println(exercises.separatedByComma(integers));
    }


}
