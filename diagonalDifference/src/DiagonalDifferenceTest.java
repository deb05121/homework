import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DiagonalDifferenceTest {
    @Test
    void testDiagonalA() {
        int[][] matrix1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[] diagonalA1 = DiagonalDifference.getDiagonalA(matrix1, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, diagonalA1);
        int[] diagonalB1 = DiagonalDifference.getDiagonalB(matrix1, 3);
        Assertions.assertArrayEquals(new int[]{3, 2, 1}, diagonalB1);

        int[][] matrix2 = {{0, 2, -4}, {1, 5, 3}, {7, 2, 9}};
        int[] diagonalA2 = DiagonalDifference.getDiagonalA(matrix2, 3);
        Assertions.assertArrayEquals(new int[]{0, 5, 9}, diagonalA2);
        int[] diagonalB2 = DiagonalDifference.getDiagonalB(matrix2, 3);
        Assertions.assertArrayEquals(new int[]{-4, 5, 7}, diagonalB2);

    }

    @Test
    void diagonalDifferentTest(){
        int[] diagonalA1 = {1,2,3};
        int[] diagonalB1 = {3,2,1};
        Assertions.assertEquals(0, DiagonalDifference.diagonalDifference(diagonalA1, diagonalB1));
        int[] diagonalA2 = {1,2,3,4};
        int[] diagonalB2 = {4,3,2,1};
        Assertions.assertEquals(0, DiagonalDifference.diagonalDifference(diagonalA2, diagonalB2));
        int[] diagonalA3 = {1,2,3,6,8,9};
        int[] diagonalB3 = {9,8,6,3,2,1};
        Assertions.assertEquals(0, DiagonalDifference.diagonalDifference(diagonalA3, diagonalB3));

    }
}
