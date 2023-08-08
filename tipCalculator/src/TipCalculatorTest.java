import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TipCalculatorTest {
    @Test
    void tipCalculatorTest() {
        int[] numbers = {5000, 1000, 2000};
        Assertions.assertEquals(2000, TipCalculator.calculateTip(numbers, 25)); // the 25% of the sum of all numbers is 2000.
        Assertions.assertEquals(800, TipCalculator.calculateTip(numbers, 10));// the 10% of the sum of all numbers is 800.
        Assertions.assertEquals(-1, TipCalculator.calculateTip(numbers, 7));// the proportion of the tip is too low.
        Assertions.assertEquals(-1, TipCalculator.calculateTip(numbers, 100));// the proportion of the tip is too high.);

    }

    @ParameterizedTest
    @ValueSource(ints = {3, 5, 8, 82, 87, 95})
    void testTipCheck(int number) {
        Assertions.assertEquals(-1, TipCalculator.checkTip(number));
    }

}
