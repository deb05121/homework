import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StrongNumberTest {
    @Test
    void testFactorialSumOfDigits() {
        Assertions.assertEquals(145, StrongNumber2.getDigitFactorialSum(145));
        Assertions.assertEquals(3, StrongNumber2.getDigitFactorialSum(12));
        Assertions.assertEquals(30, StrongNumber2.getDigitFactorialSum(34));
        Assertions.assertEquals(8, StrongNumber2.getDigitFactorialSum(23));
    }

    @Test
    void testFactorial() {
        Assertions.assertEquals(1, StrongNumber2.getFactorial(1));
        Assertions.assertEquals(2, StrongNumber2.getFactorial(2));
        Assertions.assertEquals(6, StrongNumber2.getFactorial(3));
        Assertions.assertEquals(24, StrongNumber2.getFactorial(4));
        Assertions.assertEquals(120, StrongNumber2.getFactorial(5));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,23,34,45,146})
    void testIsStrong(int number){
        Assertions.assertFalse(StrongNumber2.isStrong(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {145})
    void testIsStrong_(int number){
        Assertions.assertTrue(StrongNumber2.isStrong(number));
    }


}
