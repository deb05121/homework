import java.util.Scanner;

public class CollatzSequence {
    static int product = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        boolean isValid;
        do {
            System.out.println("Type a number higher than 3 and less than 12500");
            userNumber = scan.nextInt();
            isValid = checkUserNumber(userNumber);
        } while (!isValid);

        int pieces = getCollatzSequence(userNumber);
        System.out.println();
        checkEasterEgg();

        int lastNumber = getSequence(pieces);
        System.out.println();

        if (lastNumber > 10000) {
            System.out.println("The last number of sequence is higher than 10000");
        } else {
            System.out.println("The last number of sequence isn't higher than 10000");
        }
        System.out.println("Good bye!");
    }

    private static int getSequence(int element) {
        System.out.print(element + ", ");
        for (int i = 1; i < 10; i++) {
            element *= 2;
            System.out.print((element) + ", ");
        }
        return element;
    }

    static void checkEasterEgg() {
        if (product == 5120) {
            System.out.println("Ester egg!");
        }
    }

    static int getCollatzSequence(int nextNumber) {

        product = nextNumber;
        int pieces = 1;
        System.out.print(nextNumber);
        do {
            System.out.print(", ");
            if (nextNumber % 2 == 0) {
                nextNumber = nextNumber / 2;
                
            } else {
                nextNumber = nextNumber * 3 + 1;
            }
            System.out.print(nextNumber);
            pieces++;
            product *= nextNumber;
        } while (nextNumber != 1);
        return pieces;
    }

    static boolean checkUserNumber(int userNumber) {
        return (userNumber > 3 && userNumber < 12500);
    }
}
