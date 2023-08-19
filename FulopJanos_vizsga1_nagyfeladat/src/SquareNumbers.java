import java.util.Scanner;

public class SquareNumbers {
    static int counter;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isContinuing = true;
        System.out.println("Type your name, please.");
        String userName = scan.nextLine();
        System.out.printf("Hello %s!%n", userName);
        while (isContinuing) {
            boolean notValid = false;
            int userNumber = -1;
            do {
                if (counter < 3) {
                    System.out.println("Please type a number between 0 and 10000.");
                    userNumber = getUserNumber(scan);
                    notValid = checkUserNumber(userNumber);
                } else if (counter < 6) {
                    System.out.println("Wrong number. Try one more time. Your number should be higher than -1 and less than 10001, for instance 111");
                    userNumber = getUserNumber(scan);
                    notValid = checkUserNumber(userNumber);
                } else {
                    System.out.println("Your numbers are all wrong. Sorry, game over. Bye!");
                    System.exit(0);
                }

            } while (notValid);
            calculate(userNumber);
            System.out.println("Do you continue? (y/n)");
            scan.nextLine();
            String answer = scan.nextLine();

            if (answer.equals("n")) {
                isContinuing = false;
            }
        }
        scan.close();
    }

    private static void calculate(int userNumber) {
        double basicNumber = Math.sqrt(userNumber);
        if (basicNumber % 1 == 0) {
            System.out.printf("This is a square number: %d%n", userNumber);
            System.out.printf("The basic number is: %.0f%n", basicNumber);
            if (basicNumber == 42) {
                System.out.println("BINGO!");
            }
        } else {
            System.out.printf("This isn't a square number: %d%n", userNumber);
            boolean isNotDone = true;
            int number = userNumber;
            do {

                basicNumber = Math.sqrt(--number);
                if (basicNumber % 1 == 0) {
                    System.out.printf("The less square number: %d%n", number);
                    System.out.printf("The basic number is: %.0f%n", basicNumber);
                    isNotDone = false;
                }
            } while (isNotDone);
            isNotDone = true;
            number = userNumber;
            do {
                basicNumber = Math.sqrt(++number);
                if (basicNumber % 1 == 0) {
                    System.out.printf("The higher square number: %d%n", number);
                    System.out.printf("The basic number is: %.0f%n", basicNumber);
                    isNotDone = false;
                }
            } while (isNotDone);
        }
    }

    private static boolean checkUserNumber(int userNumber) {
        counter++;
        return (userNumber < 0 || userNumber > 10_000);
    }

    private static int getUserNumber(Scanner scan) {
        return scan.nextInt();
    }
}
