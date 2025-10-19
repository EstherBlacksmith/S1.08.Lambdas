package level1;

@FunctionalInterface
interface InsideOut {
    String reverse(String somethingToReverse);
}

public class Exercise_8 {
    public static void main(String[] args) {
        String str = "AEIOU";

        InsideOut reversedString = (inputString) -> inputString.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

        System.out.println(reversedString.reverse(str));
    }
}
