public class Calculator {

    public static float divide(float num1, float num2) {
        if (!isNotZero(num2)) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("You can't divide by zero");
        }
    }

    private static boolean isNotZero(float input) {
        return input != 0;
    }

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}