import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void calculatorTest() {
        Assertions.assertEquals(12, Calculator.sum(10, 2));
        Assertions.assertEquals(12, Calculator.sum(-10, 2));
        Assertions.assertEquals(8, Calculator.difference(10, 2));
        Assertions.assertEquals(8, Calculator.difference(10, 2));
        Assertions.assertEquals(20, Calculator.Multiplication(10, 2));
        Assertions.assertEquals(20, Calculator.Multiplication(10, 2));
        Assertions.assertEquals(5, Calculator.Division(10, 2));
        Assertions.assertEquals(5, Calculator.Division(10, 2));
        Assertions.assertEquals(0, Calculator.ModularDivision(10, 2));
        Assertions.assertEquals(0, Calculator.ModularDivision(10, 2));
        Assertions.assertEquals(100, Calculator.Power(10, 2));
        Assertions.assertEquals(100, Calculator.Power(10, 2));
        Assertions.assertEquals(2, Calculator.Percentage(10, 20));
        Assertions.assertEquals(2, Calculator.Percentage(10, 20));
        Assertions.assertEquals(10, Calculator.SquareRoot(100));
        Assertions.assertEquals(10, Calculator.SquareRoot(100));
        Assertions.assertEquals(120,Calculator.factorial(5));
        Assertions.assertEquals(720,Calculator.factorial(6));
    }
}