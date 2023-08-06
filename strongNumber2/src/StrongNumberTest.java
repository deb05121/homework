import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumberTest {
    @Test
    void testFactorialSumOfDigits() {
        Assertions.assertTrue(StrongNumber2.getDigitFactorialSum(145));
    }

    @Test
    void testFactorial() {
        Assertions.assertEquals(1, StrongNumber2.getFactorial(1));
        Assertions.assertEquals(2, StrongNumber2.getFactorial(2));
        Assertions.assertEquals(6, StrongNumber2.getFactorial(3));
        Assertions.assertEquals(24, StrongNumber2.getFactorial(4));
        Assertions.assertEquals(120, StrongNumber2.getFactorial(5));
    }


}
