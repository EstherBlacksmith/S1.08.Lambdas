package level1;

@FunctionalInterface
interface PiValue {
    Double getPiValue();
}

public class Exercise_5 {
    public static void main(String[] args) {

        PiValue customPi = () -> 3.1415;

        System.out.println(customPi.getPiValue());
    }
}
