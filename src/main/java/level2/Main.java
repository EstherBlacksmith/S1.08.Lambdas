package level2;

import java.util.ArrayList;

public class Main {
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
        Exercise1 ex1 = new Exercise1();
        System.out.println(ex1.startWithAndTotalLetters(namesString, AUPPERCASE, THREE));
    }


}
