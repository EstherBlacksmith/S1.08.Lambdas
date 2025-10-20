package level1.Exercise_8;


public class Main_8 {
    public static void main(String[] args) {
        String str = "AEIOU";

        InsideOut reversedString = lambdaBody();

        System.out.println(reversedString.reverse(str));
    }

    static InsideOut lambdaBody() {
        return (inputString) -> inputString.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    }

}
