import java.util.Scanner;

public class HeavenNumbers {
    public static void main(String[] args) {
        boolean isHeavenly = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = scan.nextInt();

        if (userNumber % 2 == 0 && userNumber < 100 && userNumber % 7 != 0) {
            isHeavenly = true;
        } else {
            if (userNumber > 300 && userNumber % 13 == 0) {
                byte numberOfDivisor = 2; // any number, but one, always can be divided by one and itself
                int i = 2;
                while (numberOfDivisor < 9 && i <= (Math.sqrt(userNumber))) {

                    if (userNumber % i == 0) {
                        System.out.println(i + " * " + userNumber/i);
                        System.out.println(numberOfDivisor);
                        numberOfDivisor += 2; //when you found a divisor there was definitely an other dealer
                        if (numberOfDivisor >= 9) {
                            isHeavenly = true;
                        }
                    }
                    i++;
                }
            }
        }
        System.out.println("Is your number a heaven number? " + isHeavenly);
        scan.close();

    }
}
