import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class TipCalculatorTest {
    @ParameterizedTest
    @ValueSource
    void tipCalculatorTest() {
        Assertions.assertEquals(-1, TipCalculator.calculateTip();
    }


}
