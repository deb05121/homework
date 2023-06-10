import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type a bigger number than 0:");
        int userNumber = scan.nextInt();
        int n = 0;

        if (userNumber < 1) {
            System.out.println("Please enter a number greater than 0");

        }

        for (int i = 1; i <= userNumber; i++) {
            if (i % 3 == 0) {
                n = 3;
            }
            if (i % 5 == 0) {
                n = 5;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                n = 35;
            }

            switch (n) {
                case 3 -> System.out.println("Fizz");
                case 5 -> System.out.println("Buzz");
                case 35 -> System.out.println("FizzBuzz");

                default -> System.out.println(i);
            }
            n = 0;
        }

    }

}
