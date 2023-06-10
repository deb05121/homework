import java.util.Scanner;

public class Feladat03 {//Returns the result of the following operation: n1-n2+n3-n4+n5
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[] op = {'+', '-', '+', '-', '+'};

        int i = 0;

        int[] numbers = new int[5];
        int sum = 0;
        for (int n : numbers
        ) {
            System.out.println("next number: ");
            if (op[i] == '+') {
                sum += scan.nextInt();
            } else {
                sum -= scan.nextInt();
            }
            i++;
        }

        System.out.println("Az összeg: " + sum);
        scan.close();
    }


}
