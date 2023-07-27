import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void calculatorTest() {
        Assertions.assertEquals(12, Calculator.sum(10, 2));
        Assertions.assertEquals(-8, Calculator.sum(-10, 2));
        Assertions.assertEquals(8, Calculator.difference(10, 2));
        Assertions.assertEquals(12, Calculator.difference(10, -2));
        Assertions.assertEquals(20, Calculator.multiplication(10, 2));
        Assertions.assertEquals(-20, Calculator.multiplication(10, -2));
        Assertions.assertEquals(5, Calculator.division(10, 2));
        Assertions.assertEquals(-5, Calculator.division(10, -2));
        Assertions.assertEquals(0, Calculator.modularDivision(10, 2));
        Assertions.assertEquals(0, Calculator.modularDivision(10, -2));
        Assertions.assertEquals(100, Calculator.power(10, 2));
        Assertions.assertEquals(0.01, Calculator.power(10, -2));
        Assertions.assertEquals(1, Calculator.power(10, 0));

        Assertions.assertEquals(2, Calculator.percentage(10, 20));
        Assertions.assertEquals(2.5, Calculator.percentage(10, 25));
        Assertions.assertEquals(10, Calculator.squareRoot(100));
        Assertions.assertEquals(9, Calculator.squareRoot(81));
        Assertions.assertEquals(120,Calculator.factorial(5));
        Assertions.assertEquals(720,Calculator.factorial(6));
    }
}