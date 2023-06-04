import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number to sum of squares: ");
        int userNumber = scan.nextInt();
        long sum = 0;

        for (int i = 1; i <= userNumber ; i++) {
            sum += i * i;
        }
        System.out.println("Sum of the squares from 1 to "+ userNumber + ":" +
                " " + sum);

    }
}
