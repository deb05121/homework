import java.util.Scanner;

public class Feladat07 {//Returns if the number 128 can be found in the given numbers
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Next number: ");
            numbers[i] = scan.nextInt();
        }

        boolean thereIs128 = false;
        int index = 0;
        do {
            if (numbers[index] == 128) {
                thereIs128 = true;
            }
            index++;
        } while (!thereIs128 && index < 5);

        System.out.println(thereIs128 ? "There is 128 in the array." : "There isn't 128 in the array.");

    }
}
