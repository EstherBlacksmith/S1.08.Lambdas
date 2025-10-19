package level2;

import java.sql.SQLOutput;

public class Main_3 {
    public static void main(String[] args)  {
        BasicMathOperations summing = (number1,number2)-> (float) (number1 + number2);
        BasicMathOperations resting = (number1,number2)-> (float) (number1 - number2);
        BasicMathOperations multiplying = (number1,number2)-> (float) (number1 * number2);
        BasicMathOperations dividing = (number1,number2)-> (float) (number1 / number2);

        try {
            System.out.println("Addition: " + summing.operation(2.0,-58.3));
            System.out.println("Rest: " + resting.operation(2.0,8.0));
            System.out.println("Multiplication: " + multiplying.operation(2.0,0.8));
            System.out.println("Division: " + dividing.operation(2.0,6.0));

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
