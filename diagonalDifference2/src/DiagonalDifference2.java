import java.util.Random;
import java.util.Scanner;

public class DiagonalDifference2 {

    public static void main(String[] args) {

        System.out.println("Matrix: {n x n}; type n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix;
        matrix = fillMatrix(n);
        System.out.println();
        int diagonalDifference = diagonalDifference2(matrix, n);
        System.out.println();
        System.out.println(diagonalDifference);
    }

    static int diagonalDifference2(int[][] matrix, int n) {

        int difference = 0;
        for (int i = 0; i < n; i++) {
            difference += matrix[i][i];
        }
        for (int i = 0; i < n; i++) {
            difference -= matrix[i][n - 1 - i];
        }
        return difference;
    }

    static int[][] fillMatrix(int n) {
        Random rnd = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
        }
        return matrix;
    }
}