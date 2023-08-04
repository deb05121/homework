import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GameTest {
    @Test
    void findPrimeTest() {
        Assertions.assertEquals(11, Game.findPrime(10));
        Assertions.assertEquals(13, Game.findPrime(12));
        Assertions.assertEquals(101, Game.findPrime(100));
        Assertions.assertEquals(1009, Game.findPrime(1000));
        Assertions.assertEquals(10007, Game.findPrime(10000));

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 5001, 10000})
    void checkNumberTest(int number) {
        Assertions.assertTrue(Game.checkNumber(number));
    }

    @Test
    void getCubicNumberTest(){
        Assertions.assertEquals(3, Game.getCubicNumber(27));
        Assertions.assertEquals(4, Game.getCubicNumber(64));
        Assertions.assertEquals(5, Game.getCubicNumber(125));

    }
}
