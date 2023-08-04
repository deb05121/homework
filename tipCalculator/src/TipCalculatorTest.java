import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

public class TipCalculatorTest {
    @Test

    void tipCalculatorTest() {
        
        Assertions.assertEquals(100, TipCalculator.calculateTip(new int[]{100, 100, 200}, 25));
        //Assertions.assertEquals(-1, TipCalculator.getTip());
    }


}
