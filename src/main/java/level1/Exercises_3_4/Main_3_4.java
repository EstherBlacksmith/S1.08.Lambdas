package level1.Exercises_3_4;

import java.util.ArrayList;
import java.util.List;


public class Main_3_4 {
    private static final List<String> monthsList = new ArrayList<>();

    public static void main(String[] args) {
        MonthsManipulation monthsManipulation = new MonthsManipulation();
        MonthsManipulation.addingMonths(monthsList);
        monthsManipulation.listingMonths(monthsList);
        monthsManipulation.listingMonthsReferenced(monthsList);
    }


}
