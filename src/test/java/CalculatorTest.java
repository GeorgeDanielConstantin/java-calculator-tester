import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculatorTest {
    @Test
    void divide() {
    }

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
    }

    @Test
    void multiply() {
    }
}