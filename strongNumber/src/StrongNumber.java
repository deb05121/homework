import java.util.Arrays;
import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = scan.nextInt();
        int[] numbers = getNumbersArray(userNumber);
        checkStrongNumber(userNumber, numbers);
    }

    static int[] getNumbersArray(int userNumber) {
        int checkedNumber = userNumber;
        int len = String.valueOf(userNumber).length();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = checkedNumber % 10;
            checkedNumber /= 10;
        }
        return numbers;
    }

    static void checkStrongNumber(int userNumber, int[] numbers) {

        int strongNumber = 0;
        for (int num : numbers) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            strongNumber += factorial;
        }
        if (strongNumber == userNumber) {
            System.out.printf("%d is a strong number.%n", userNumber);
        } else {
            System.out.printf("%d isn't a strong number.%n", userNumber);
        }
    }
}
