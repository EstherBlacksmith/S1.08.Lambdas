package level2;

@FunctionalInterface
public interface BasicMathOperations <E extends Exception> {
    Float operation(Double a, Double b) throws E;
}
