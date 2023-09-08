import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestBinarySearch {
    @ParameterizedTest
    @ValueSource(ints = {1, 4, 13, 51})
    void testBinSearch(int number) {
        int[] arrayOfIntegers = {0, 2, 3, 6, 7, 8, 9, 11, 14, 22, 23, 33, 37, 44, 52};
        Assertions.assertEquals(-1, BinarySearch.binarySearcher(arrayOfIntegers, 0, arrayOfIntegers.length - 1, number));
    }

    @Test
    void testEdgeCase() {
        int[] arrayOfIntegers = {0, 2, 3, 6, 7, 8, 9, 11, 14, 22, 23, 33, 37, 44, 52};
        Assertions.assertEquals(0, BinarySearch.binarySearcher(arrayOfIntegers, 0, arrayOfIntegers.length - 1, 0));

    }

    @Test
    void testEdgeCase_() {
        int[] arrayOfIntegers = {0, 2, 3, 6, 7, 8, 9, 11, 14, 22, 23, 33, 37, 44, 52};
        Assertions.assertEquals(14, BinarySearch.binarySearcher(arrayOfIntegers, 0, arrayOfIntegers.length - 1, 52));
    }
}
