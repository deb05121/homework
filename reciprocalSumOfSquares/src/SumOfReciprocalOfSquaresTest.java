import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class SumOfReciprocalOfSquaresTest {
    @Test
    void searchOfMultiplesTest() {
        Assertions.assertEquals(List.of(14000, 12000, 10000, 8000, 6000, 4000, 2000), SumOfReciprocalOfSquares.searchOfMultiples(15000));
        Assertions.assertEquals(List.of( 2000), SumOfReciprocalOfSquares.searchOfMultiples(3000));

    }

    @ParameterizedTest
    @ValueSource(ints = {-5,0,1,3,4,15001})
    void checkNumberTest_True(int num){
        Assertions.assertTrue(SumOfReciprocalOfSquares.checkNumber(num));
    }
    @ParameterizedTest
    @ValueSource(ints={5,11111,15000})
    void checkNumberTest_False(int nbr){
        Assertions.assertFalse(SumOfReciprocalOfSquares.checkNumber(nbr));
    }

    @Test
    void calculateTest(){
        Assertions.assertEquals(1.4636111111111112,SumOfReciprocalOfSquares.calculate(5));
        Assertions.assertEquals(1.6448674024037366,SumOfReciprocalOfSquares.calculate(15000));
    }

}
