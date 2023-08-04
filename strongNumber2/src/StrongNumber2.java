import java.util.Scanner;

public class StrongNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = scan.nextInt();
        checkStrongNumber(userNumber);
    }


    static void checkStrongNumber(int userNumber) {

        int strongNumber = 0;
        int checkedNumber = userNumber;
        int len = String.valueOf(userNumber).length();
//I skipped the array creation, so I needed less for loops
        for (int i = 0; i < len; i++) {
            int factorial = 1;
            int actualNumber = checkedNumber % 10;
            checkedNumber /= 10;
            for (int j = 1; j <= actualNumber; j++) {
                factorial *= j;
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
