import java.util.Scanner;

public class Feladat06 {/* Returns the number of those that are divisible by five
                            Returns if the sum of them can be divisible by 7
                            Returns the number of those that are greater than 7 and smaller than 11
                            Returns the number of those that are primes
                            Returns if there are more than 2 primes in the given numbers
                            Returns if there are at least 4 numbers there that are divisible by 4 
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Next number: ");
            numbers[i] = scan.nextInt();
        }
        int divisibleBy4 = 0;
        int piecesOfPrimes = numbers.length;
        for (int n : numbers) {
            if (n % 4 == 0) {
                divisibleBy4++;
            }
            if (n % 5 == 0) {
                System.out.println("Divisible by 5: " + n);
            }
            if (n % 7 == 0) {
                System.out.println("Divisible by 7: " + n);
            }
            if (n > 7 && n < 11) {
                System.out.println("Greater than 7 and smaller than 11: " + n);
            }
            boolean prim = true;
            int i = 2;
            int j = 0;
            while (prim && i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    prim = false;
                    piecesOfPrimes--;
                }
                i++;
                j++;
            }
        }
        System.out.println("Pieces of primes: " + piecesOfPrimes);
        System.out.println(piecesOfPrimes > 2 ? "Pieces of primes > 2: true" : "Pieces of primes > 2 : false");
        System.out.println(divisibleBy4 > 3 ? "There are at least 4 number divisible by 4." : "There aren't at least 4 number divisible by 4.");
    }

}
