import java.util.Scanner;

public class StrongNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = scan.nextInt();

        boolean isStrong = getDigitFactorialSum(userNumber);
        if (isStrong) {
            System.out.printf("%d is a strong number.", userNumber);
        } else {
            System.out.printf("%d isn't a strong number.", userNumber);
        }
    }


    static boolean getDigitFactorialSum(int userNumber) {
        int sumOfFactorials = 0;
        int checkedNumber = userNumber;
        int len = String.valueOf(userNumber).length();
        for (int i = 0; i < len; i++) {
            int factorial = 1;
            int digit = checkedNumber % 10;
            checkedNumber /= 10;
            factorial = getFactorial(digit);
            sumOfFactorials += factorial;
        }
        return sumOfFactorials == userNumber;
    }


    static int getFactorial(int digit) {
        int actualFactorial = 1;
        for (int j = 1; j <= digit; j++) {
            actualFactorial *= j;
        }
        return actualFactorial;
    }
}
