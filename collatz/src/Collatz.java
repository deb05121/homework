import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        int max = 1;
        System.out.println("Type number between 2 and 200_000");
        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        int userNumber = 0;
        byte tryType = 1;
        while (!isValid) {
            userNumber = scan.nextInt();
            isValid = isValidNumber(userNumber);
            if (tryType++ == 5) {
                System.out.println("Game over!");
                break;
            } else {
                System.out.println("This number is not valid. Try again:");
            }
        }

        if (isValid) {
            while (userNumber > 1) {
                userNumber = getNextCollatzNumber(userNumber);
                if (max < userNumber) {
                    max = userNumber;
                }
                System.out.print(userNumber + ", ");
            }
        }

        scan.close();

    }

    static boolean isValidNumber(int number) {
        return (number >= 2 && number <= 200_000);
    }

    static int getNextCollatzNumber(int number) {

        if (number % 2 == 0) {
            number = number / 2;
        } else {
            number = 3 * number + 1;
        }

        return number;
    }

}
