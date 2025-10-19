package level1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Exercises_3_4 {
    private static List<String> monthsList = new ArrayList<>();

    public static void main(String[] args) {
        addingMonths();
        exercise1();
        exercise2();
    }

    private static void addingMonths() {
        Calendar calendar = Calendar.getInstance();

        for (int i = 0; i < 11; i++) {
            calendar.set(2025, i, 1);
            String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK);
            monthsList.add(monthName);
        }
    }

    private static void exercise1() {
        monthsList.stream().forEach(System.out::println);
    }

    private static void exercise2() {
        monthsList.forEach(System.out::println);
    }
}
