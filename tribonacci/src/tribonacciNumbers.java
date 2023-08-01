import java.util.Scanner;

public class tribonacciNumbers {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        byte fails = 0;
        boolean notValid = true;
        boolean gameOver = false;
        int userNumber = 0;
        do {
            System.out.println("Type a number between 4 and 25");
            while (notValid && fails < 7) {
                userNumber = getNumber(scan);

                if (userNumber < 4 || userNumber > 25) {
                    fails++;
                    if (fails == 4) {
                        System.out.println("you should listen more carefuly, the number can be just at least 4 and at most 25");
                    }
                    if (fails == 7) {
                        gameOver = true;
                    }
                } else {
                    notValid = false;
                }
            }
            if (!gameOver) {

                if (userNumber != 12 && userNumber != 16) {
                    getTribonacciSequence(userNumber);
                } else if (userNumber == 12) {
                    System.out.println("Easter egg!");
                    System.out.println("Give me 2 numbers.");
                    System.out.println("Type first number: ");
                    int n1 = getNumber(scan);
                    System.out.println("Type second number: ");
                    int n2 = getNumber(scan);
                    getFibonacci(n1, n2);

                } else {
                    System.out.println("Easter egg!");
                    System.out.println(userNumber + " dividers: ");
                    getDivides(userNumber);
                }
                System.out.println("Let's continue?(y or n)");
                scan.nextLine();
                String answer = scan.nextLine();
                if (!answer.equals("y")) {
                    gameOver = true;

                } else {
                    fails = 0;
                    userNumber = 0;
                    notValid = true;

                }
            }

        } while (!gameOver);
        scan.close();
    }

    static void getDivides(int userNumber) {
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    static void getFibonacci(int n1, int n2) {
        int[] fibArray = new int[12];
        fibArray[0] = n1;
        fibArray[1] = n2;
        for (int i = 2; i < 12; i++) {
            fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
        }
        arrayPrinter(fibArray);
    }

    static void getTribonacciSequence(int userNumber) {

        int[] tribArray = new int[userNumber];
        tribArray[0] = 0;
        tribArray[1] = 1;
        tribArray[2] = 2;
        for (int i = 3; i < userNumber; i++) {
            tribArray[i] = tribArray[i - 3] + tribArray[i - 2] + tribArray[i - 1];
        }
        arrayPrinter(tribArray);
    }

    static void arrayPrinter(int[] bonacciArray) {
        for (int t : bonacciArray
        ) {
            System.out.print(t + ", ");
        }
        System.out.println();
    }

    static int getNumber(Scanner scan) {
        return scan.nextInt();
    }
}
