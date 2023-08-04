import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStrongNumber {
    @Test
    void arrayTest() {
        int[] numbers = StrongNumber.getNumbersArray(145);

        Assertions.assertArrayEquals(new int[]{5, 4, 1}, numbers);;
    }
    @Test


}
