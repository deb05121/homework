import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiagonalDifferenceTest {
    @Test
    void diagonalDifferenceTest() {
        int[][] matrix0 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assertions.assertEquals(0, DiagonalDifference2.diagonalDifference2(matrix0, 3));
        int[][] matrix1 = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 0}, {0, 1, 2, 3}};
        Assertions.assertEquals(0, DiagonalDifference2.diagonalDifference2(matrix1, 4));

    }
}
