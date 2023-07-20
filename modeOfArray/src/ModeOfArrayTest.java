import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModeOfArrayTest {
    @Test
    void modeOfArrayTest() {
        int[] values1 = {3, 5, 1, 5, 5, 5, 1, 2, 2, 2, 3, 3};
        Assertions.assertEquals(5, ModeOfArray.getMode(values1));
        int[] values2 = {5, 5, 1, 2, 3, 2, 3, 3};
        Assertions.assertEquals(3, ModeOfArray.getMode(values2));
        int[] values3 = {3, 2, 2, 3, 3, 1, 1, 5};
        Assertions.assertEquals(3, ModeOfArray.getMode(values3));
        int[] values4 = {3, 5, 1, 5, 5, 1, 2, 2, 2, 3, 3};
        Assertions.assertEquals(2, ModeOfArray.getMode(values4));

    }
}
