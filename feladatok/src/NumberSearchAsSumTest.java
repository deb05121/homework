import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSearchAsSumTest {
    @Test
    void testSumFind() {
        int[] numbers = {1, 2, 3, 4, 5};
        Assertions.assertTrue(NumberSearchAsSum.findCoupleOfNumber(numbers,7));
        Assertions.assertTrue(NumberSearchAsSum.findCoupleOfNumber(numbers,8));
        Assertions.assertTrue(NumberSearchAsSum.findCoupleOfNumber(numbers,9));
        Assertions.assertFalse(NumberSearchAsSum.findCoupleOfNumber(numbers,10));
        Assertions.assertFalse(NumberSearchAsSum.findCoupleOfNumber(numbers,0));
        Assertions.assertFalse(NumberSearchAsSum.findCoupleOfNumber(numbers,1));

    }
}
