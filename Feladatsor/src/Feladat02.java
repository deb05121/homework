import java.util.Scanner;

public class Feladat02 {//Returns the product of them
    //Returns if the product of those numbers is greater than 100

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];
        int prod = 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Type the next number: ");
            numbers[i] = scan.nextInt();
            prod *= numbers[i];
        }

        System.out.println("A szorzat: " + prod);
        System.out.println(prod > 100 ? "The prod is greater than 100." : "The prod isn't greater than 100.");
        scan.close();

    }

}
