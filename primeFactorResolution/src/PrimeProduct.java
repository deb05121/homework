import java.util.ArrayList;
import java.util.Scanner;

public class PrimeProduct {
    public static void main(String[] args) {
        //Scan
        int userNumber = scanUserNumber();

        //make prime factor resolution
        ArrayList<Integer> primeFactors = getPrimeFactors(userNumber);
        if (primeFactors.size() > 0) {
            System.out.println("Prime factors of " + userNumber + ": " + primeFactors);
        } else {
            System.out.println("The " + userNumber + " is a prime.");
        }
    }

    static int scanUserNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number, I find prime factors of the number.");
        int number = scan.nextInt();
        return number;
    }

    static ArrayList<Integer> getLimit(int userNumber) {

        int limit = (int) (Math.sqrt(userNumber));
        ArrayList<Integer> primesToLimit = new ArrayList<>();
        boolean[] interval = new boolean[limit + 1];
        //System.out.println("limit: " + limit);
        for (int i = 2; i <= limit; i++) {
            if (interval[i] == false) {
                primesToLimit.add(i);
            }
            int j = i;
            while (i * j < limit) {
                interval[i * j] = true;
                j++;
            }
        }
        //System.out.println(primesToLimit);
        return primesToLimit;
    }

    static ArrayList<Integer> getPrimeFactors(int userNumber) {
        //Find primes between 2 and square of userNumber
        ArrayList<Integer> primesToLimit = getLimit(userNumber);

        int number = userNumber;
        ArrayList<Integer> primeFactorList = new ArrayList<>();
        for (int index = 0; index < primesToLimit.size(); index++) {

            while (number % primesToLimit.get(index) == 0) {
                number /= primesToLimit.get(index);
                primeFactorList.add(primesToLimit.get(index));
            }
        }
        if (number > Math.sqrt(userNumber) && number < userNumber) {
            primeFactorList.add(number);//14, 26 ...: amikor a négyzetgyöknél nagyobb prím van az osztók között
        }
        return primeFactorList;
    }
}
