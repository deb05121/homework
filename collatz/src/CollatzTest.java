import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CollatzTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 5})
    void testCollatzSequence(int number) {
        Assertions.assertTrue(Collatz.isValidNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 200_001})
    void testWithNonValidNumbers(int number) {
        Assertions.assertFalse(Collatz.isValidNumber(number));
    }

    @Test
    void getNextCollatzNumber() {
        Assertions.assertEquals(3, Collatz.getNextCollatzNumber(6));
        Assertions.assertEquals(16, Collatz.getNextCollatzNumber(5));
        Assertions.assertEquals(512, Collatz.getNextCollatzNumber(1024));
    }

}
