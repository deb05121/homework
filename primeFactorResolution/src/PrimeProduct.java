import java.util.ArrayList;
import java.util.Scanner;

public class PrimeProduct {
    public static void main(String[] args) {
        //Scan
        int userNumber = scanUserNumber();
        //Find primes between 2 and square of userNumber
        ArrayList<Integer> primesToLimit = getLimit(userNumber);
        //make prime factor resolution
        ArrayList<Integer> primeFactors = getPrimeFactors(userNumber, primesToLimit);
        if(primeFactors.size()>0){
            System.out.println("Prime factors of " + userNumber + ": " + primeFactors);
        }else{
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
        int limit = (int) Math.sqrt(userNumber);
        
        ArrayList<Integer> primesToLimit = new ArrayList<>();
        boolean[] interval = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            if (interval[i] == false) {
                primesToLimit.add(i);
            }
            int j = i;
            while (i * j < limit) {
                interval[i * j] = true;
                j++;

            }
        }

        return primesToLimit;
    }

    static ArrayList<Integer> getPrimeFactors(int userNumber, ArrayList<Integer> primesToLimit) {

        ArrayList<Integer> primeFactorList = new ArrayList<>();
        for (int index = 0; index < primesToLimit.size(); index++) {

            while (userNumber % primesToLimit.get(index) == 0) {
                userNumber /= primesToLimit.get(index);
                primeFactorList.add(primesToLimit.get(index));
            }
        }
        return primeFactorList;
    }
}
