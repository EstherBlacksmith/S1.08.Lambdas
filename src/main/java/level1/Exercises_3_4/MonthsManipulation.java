package level1.Exercises_3_4;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MonthsManipulation {

    protected static List<String> addingMonths(List<String> monthsList) {
        Calendar calendar = Calendar.getInstance();

        for (int i = 0; i < 11; i++) {
            calendar.set(2025, i, 1);
            String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK);
            monthsList.add(monthName);
        }
        return monthsList;
    }

    protected void listingMonths(List<String> monthsList) {
        monthsList.stream().forEach(System.out::println);
    }

    protected void listingMonthsReferenced(List<String> monthsList) {
        monthsList.forEach(System.out::println);
    }
}
