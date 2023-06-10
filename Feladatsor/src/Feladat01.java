import java.util.Scanner;

public class Feladat01 {//Returns the sum of them

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Type the next number: ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        System.out.println("Az összeg: " + sum);
        scan.close();

    }

}
