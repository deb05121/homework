import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static byte fails;
    static boolean gameOver;
    static int userNumber;


    public static void main(String[] args) {
        System.out.println("Type a number between 1 and 5000");
        boolean isNotValid = true;
        int prime;
        do {
            while (isNotValid && !gameOver) {
                userNumber = getNumber(scan);
                isNotValid = checkNumber(userNumber);
            }
            if (!gameOver) {
                getPrintNumber(userNumber);

                int piecesOfDividers = getDividesOfNumber(userNumber);
                if (piecesOfDividers > 2) {
                    prime = findPrime(userNumber);
                }
                getPriceOfIcecream(userNumber);
                getVolumeOfCube(userNumber);
                getCubicNumber(userNumber);
                getChangeEuro(userNumber);
                getEasterEgg(userNumber);
            }
            gameOver = true;
        } while (!gameOver);

    }

    static void getEasterEgg(int userNumber) {
        if (userNumber == 4993) {
            System.out.println();
            System.out.println("BINGO!");
        }
    }

    static void getChangeEuro(int userNumber) {
        double eur = userNumber / 340.0;
        System.out.printf("%d Forint is worth %.2f EUR", userNumber, eur);
    }

    static double getCubicNumber(int userNumber) {
        double cubicNumber = Math.pow(userNumber, 1 / 3.0);
        //27-re működött,de nem működött 64-re 125-re...
        double roundedNumber = cubicNumber * 100_000_000;
        roundedNumber = Math.ceil((roundedNumber / 100) * 100);
        cubicNumber = roundedNumber / 100_000_000;

        if ((int) cubicNumber == cubicNumber) {
            System.out.printf("The %d is a cubic number.%n", userNumber);
        } else {
            System.out.printf("The %d isn't a cubic number.%n", userNumber);
        }
        return cubicNumber;
    }

    static void getVolumeOfCube(int userNumber) {
        double cubeVolume = Math.pow(userNumber, 3);
        System.out.printf("The volume of cube with a side length of %d meters is %.2f m3%n", userNumber, cubeVolume);
    }

    static void getPriceOfIcecream(int userNumber) {
        int price = 275 * userNumber;
        System.out.printf("Price of %d scoops of ice cream is %d Forint%n", userNumber, price);
    }

    static int getDividesOfNumber(int number) {
        int piecesOfDividers = 0;
        if (number == userNumber) {
            System.out.print("Dividers of " + userNumber + ": ");
        }
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                piecesOfDividers++;
                if (number == userNumber) {
                    System.out.print(i + ", ");
                }
            }
        }
        if (number == userNumber) {
            if (piecesOfDividers < 3) {
                System.out.println();
                System.out.printf("%d is a prime.%n", number);
            } else {
                System.out.println();
                System.out.printf("%d isn't a prime.%n", number);
            }
        }
        return piecesOfDividers;
    }

    static int findPrime(int number) {
        int prime = number;
        int numberOfDividers = 0;
        while (numberOfDividers != 2) {
            prime++;
            numberOfDividers = getDividesOfNumber(prime);
        }
        System.out.printf("The first prime number above %d is %d%n", userNumber, prime);
        return prime;
    }

    static void getPrintNumber(int userNumber) {
        System.out.println("The entered number is " + userNumber);
    }

    static boolean checkNumber(int userNumber) {

        boolean isNotValid = true;
        if (userNumber >= 1 && userNumber <= 5000) {
            isNotValid = false;
        } else {
            System.out.println("It's not good!");
            fails++;
            if (fails == 3) {
                System.out.println("Your number isn't valid, it must be higher than 0 and lower than 5001!");
            }
            if (fails == 5) {
                System.out.println("Good bye!");
                gameOver = true;
            }
        }
        return isNotValid;
    }

    static int getNumber(Scanner scan) {
        return scan.nextInt();
    }
}
