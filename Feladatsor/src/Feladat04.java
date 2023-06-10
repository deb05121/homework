import java.util.Scanner;

public class Feladat04 {//Returns the index of the first occurrence of 100
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Next number: ");
            numbers[i] = scan.nextInt();
        }

        int indexOf100 = -1;
        int index = 0;
        do {
            if (numbers[index] == 100) {
                indexOf100 = index;
            }
            index++;
        } while (indexOf100 == -1 && index < 5);

        System.out.println(indexOf100 > -1 ? "Sequence of first 100 : " + (indexOf100 + 1) : "There isn't 100 in array.");

    }
}
