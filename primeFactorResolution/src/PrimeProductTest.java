import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeProductTest {
    @Test
    void testPrimeProduct() {
        Assertions.assertEquals(List.of(2), PrimeProduct.getLimit(4));
        Assertions.assertEquals(List.of(2, 3), PrimeProduct.getLimit(9));
        Assertions.assertEquals(List.of(2, 3), PrimeProduct.getLimit(10));
        Assertions.assertEquals(List.of(2, 3, 5), PrimeProduct.getLimit(25));
        Assertions.assertEquals(List.of(2, 3), PrimeProduct.getLimit(14));
        Assertions.assertEquals(List.of(2, 3, 5), PrimeProduct.getLimit(26));
    }

    @Test
    void testPrimeFactors() {
        Assertions.assertEquals(List.of(5, 5), PrimeProduct.getPrimeFactors(25));
        Assertions.assertEquals(List.of(7, 7), PrimeProduct.getPrimeFactors(49));
        Assertions.assertEquals(List.of(2, 7), PrimeProduct.getPrimeFactors(14));
        Assertions.assertEquals(List.of(2, 13), PrimeProduct.getPrimeFactors(26));
        Assertions.assertEquals(List.of(2, 2, 3), PrimeProduct.getPrimeFactors(12));
        Assertions.assertEquals(List.of(3607, 3803), PrimeProduct.getPrimeFactors(13_717_421));
        Assertions.assertEquals(List.of(2, 3, 3, 5, 3607, 3803), PrimeProduct.getPrimeFactors(1_234_567_890));
    }
}
