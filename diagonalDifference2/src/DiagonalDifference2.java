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
        String diagonalDifference = diagonalDifference2(matrix, n);
        System.out.println();
        System.out.println(diagonalDifference);
    }

    private static String diagonalDifference2(int[][] matrix, int n) {

        String difference = "";
        for (int i = 0; i < n; i++) {

            difference += matrix[i][i];
            if (i < n - 1) {
                difference += "+";
            } else {
                difference += " - ";
            }
        }

        difference += "(";
        for (int i = 0; i < n; i++) {
            difference += matrix[i][n - 1 - i];
            if (i < n - 1) {
                difference += "+";
            }
        }
        difference += ")";
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