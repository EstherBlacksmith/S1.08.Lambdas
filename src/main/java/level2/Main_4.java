package level2;

import java.util.ArrayList;

public class Main_4 {
    public static void main(String[] args) {
        ArrayList<Object> listNumbersAndStrings = new ArrayList<>();

        listNumbersAndStrings.add("Dog");
        listNumbersAndStrings.add("Cat");
        listNumbersAndStrings.add("4");
        listNumbersAndStrings.add(100);
        listNumbersAndStrings.add("100");
        listNumbersAndStrings.add(-10);
        listNumbersAndStrings.add("Elephant");
        listNumbersAndStrings.add("Ferret");
        listNumbersAndStrings.add(8);
        listNumbersAndStrings.add("Platypus");
        listNumbersAndStrings.add("WombAt");
        listNumbersAndStrings.add("Quokka");
        ManipulatingStrings ManipulatingStrings = new ManipulatingStrings();

        ManipulatingStrings.OrderingPhonetically(listNumbersAndStrings).forEach(System.out::println);
        System.out.println("----------------");
        ManipulatingStrings.OrderingByContainingLetter(listNumbersAndStrings, "e").forEach(System.out::println);
        System.out.println("----------------");
        ManipulatingStrings.OrderingByContainingLetterAndChangingOneChar(listNumbersAndStrings, "e", 'a').forEach(System.out::println);


    }
}
