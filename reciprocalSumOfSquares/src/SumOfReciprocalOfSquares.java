import java.util.ArrayList;

import java.util.Scanner;

public class SumOfReciprocalOfSquares {
    static byte checkCounter;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber = 0;
        boolean notValidNumber;
        System.out.println(checkCounter);
        do {
            if (checkCounter < 3) {
                userNumber = userInput(scan);
            } else if (checkCounter < 6) {
                System.out.println("It's just as valid number as higher than 4 or less than 15001!");
                userNumber = userInput(scan);
            } else if (checkCounter < 10) {
                System.out.println("You gave wrong numbers. You should pay more attention to the rule: 5 <= your number <= 15000!");
                userNumber = userInput(scan);
            } else {
                System.out.println("Game over. Bye!");
                System.exit(0);
            }
            notValidNumber = checkNumber(userNumber);
        } while (notValidNumber);

        double result = calculate(userNumber);
        double limit = (Math.pow(Math.PI, 2)) / 6;
        double difference = limit - result;
        System.out.printf("Difference: %f - %f = %f%n", limit, result, difference);
        if (userNumber == 5 || userNumber == 15000) {
            System.out.println("Easter egg!");
        }
        ArrayList<Integer> twoThousands = new ArrayList<>();
        if (userNumber > 2000) {
            twoThousands = searchOfMultiples(userNumber);
            System.out.println();
        }
        System.out.println(twoThousands);
        System.out.println("Game over! Bye!");
        scan.close();
    }

    static ArrayList<Integer> searchOfMultiples(int userNumber) {
        System.out.print("Divisible by two thousand: ");
        ArrayList<Integer> twoThousands = new ArrayList<>();
        for (int i = userNumber; i > 1999; i--) {
            if (i % 2000 == 0) {
                twoThousands.add(i);
            }
        }
        return twoThousands;
    }

    static int userInput(Scanner scan) {
        System.out.println("Type a number between 5 and 15000.");
        return scan.nextInt();
    }

    static double calculate(int userNumber) {
        double result = 0;
        for (int i = 1; i <= userNumber; i++) {
            result += Math.pow(i, -2);
        }
        return result;
    }

    static boolean checkNumber(int userNumber) {
        checkCounter++;
        return (userNumber < 5 || userNumber > 15000);
    }
}
