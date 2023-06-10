import java.util.Scanner;

public class Feladat05 {/* Returns the greatest number
                            Returns the smallest number
                            Returns the difference of the greatest and the smallest number
                            Returns if the product of the greatest and the smallest number is greater than 1003
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Next number: ");
            numbers[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : numbers
        ) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Max - Min = " + (max - min));
        System.out.println((min * max) > 1003 ? "Min * Max > 1003: true" : "Min * Max > 1003: false");

    }
}
