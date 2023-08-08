import java.util.Random;
import java.util.Scanner;

public class DiagonalDifference {
    static Random rnd = new Random();
    static int[][] matrix;

    public static void main(String[] args) {

        System.out.println("Matrix: {n x n}; type n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        fillMatrix(n);
        System.out.println();

        int[] diagonalA = getDiagonalA(matrix, n);
        int[] diagonalB = getDiagonalB(matrix, n);
        System.out.println();

        int diagonalDifference = diagonalDifference(diagonalA, diagonalB);
        System.out.printf("Diagonal difference: %d%n", diagonalDifference);

        scan.close();
    }

    static int diagonalDifference(int[] diagonalA, int[] diagonalB) {
        int difference = 0;
        for (int i = 0; i < diagonalA.length; i++) {
            difference += diagonalA[i] - diagonalB[i];
        }
        return difference;
    }

    static int[] getDiagonalB(int[][] matrix, int b) {
        int[] diagonalB = new int[b];
        for (int i = 0; i < b; i++) {
            diagonalB[i] = matrix[i][b - 1 - i];
            //System.out.print(diagonalB[i]+", ");
        }
        return diagonalB;

    }

    static int[] getDiagonalA(int[][] matrix, int n) {
        int[] diagonalA = new int[n];
        for (int i = 0; i < n; i++) {
            diagonalA[i] = matrix[i][i];
            //System.out.print(diagonalA[i]+", ");
        }
        return diagonalA;
    }

    static void fillMatrix(int n) {
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
