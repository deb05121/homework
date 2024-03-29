import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int index = -1;

    public static void main(String[] args) {
        int[] arrayOfIntegers = {9, 3, 8, 2, 6, 0, 7, 23, 14, 37, 52, 44, 33, 22, 11};
        Arrays.sort(arrayOfIntegers);
        System.out.println("Which number is searched:");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        int serialNumber = binarySearcher(arrayOfIntegers,0, arrayOfIntegers.length - 1, userNumber);
        if (index > -1) {
            System.out.printf("Serial number of item in the array is: %d!", serialNumber);
        } else {
            System.out.println("This number isn't in the array.");
        }

    }

    public static int binarySearcher(int[] arrayOfIntegers, int from, int to, int userNumber) {
        int half = (from + to) / 2;

        if ((to - from) >= 0 && index < 0) {

            if (arrayOfIntegers[half] == userNumber) {
                index = half;
            } else if (arrayOfIntegers[half] < userNumber) {
                binarySearcher(arrayOfIntegers,half + 1, to, userNumber);
            } else {
                binarySearcher(arrayOfIntegers, from, half - 1, userNumber);
            }
        }
        return index;
    }

}
