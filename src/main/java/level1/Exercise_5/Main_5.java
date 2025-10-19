package level1.Exercise_5;

public class Main_5 {
    public static void main(String[] args) {

        PiValue customPi = () -> 3.1415;

        System.out.println(customPi.getPiValue());
    }
}
