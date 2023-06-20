import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type a bigger number than 0:");
        int userNumber = scan.nextInt();
        while (userNumber < 1) {
            System.out.println("Please enter a number greater than 0");
            userNumber = scan.nextInt();
        }

        for (int i = 1; i <= userNumber; i++) {
            int n = 0;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
