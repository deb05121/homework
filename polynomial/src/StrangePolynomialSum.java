import java.util.Scanner;

public class StrangePolynomialSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number more than 0: ");

        int userNumber = scan.nextInt();
        int exponent = 1;
        long sum = 0;

        for (int i = 0; i < userNumber; i++) {
            sum += Math.pow(i+1, exponent);

            switch (exponent){
                case 4-> exponent = 1;

                default-> exponent++;
            }
        }

        System.out.println("Result: "+sum);

        scan.close();
    }
}
