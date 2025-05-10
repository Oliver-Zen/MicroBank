public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    /**
     * Adds two numbers and returns the result.
     * @param a the first number.
     * @param b the second number.
     * @return the sum of a and b.
     */
    public static <T extends Number> double add(T a, T b) {
        System.out.println("Sum:" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    /**
     * Subtracts two numbers and returns the result.
     * @param a the first number.
     * @param b the second number.
     * @return the difference of a and b.
     */
    public static <T extends Number> double subtract(T a, T b) {
        System.out.println("Difference:" + (a.doubleValue() - b.doubleValue()));
        return a.doubleValue() - b.doubleValue();
    }

    /**
     * Multiplies two numbers and returns the result.
     * @param a the first number.
     * @param b the second number.
     * @return the product of a and b.
     */
    public static <T extends Number> double multiply(T a, T b) {
        System.out.println("Product:" + (a.doubleValue() * b.doubleValue()));
        return a.doubleValue() * b.doubleValue();
    }

    /**
     * Divides two numbers and returns the result.
     * @param a the first number.
     * @param b the second number.
     * @return the quotient of a and b.
     */
    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            System.out.println("b cannot be 0");
            throw new ArithmeticException("b cannot be 0");
        }
        System.out.println("Quotient:" + (a.doubleValue() / b.doubleValue()));
        return a.doubleValue() / b.doubleValue();
    }

}

