import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the basic of factorial.");
        int basic = scan.nextInt();

        for (int i = 1; i <= basic; i++) {
            factorial *= i;
        }
        System.out.println("for: "+factorial);

        int multiplier = 1;
        factorial = 1;
        while (multiplier <= basic){
            factorial *= multiplier++;

        }
        System.out.println("while: "+factorial);

        factorial = basic;
        do{
            factorial *= --basic;//it's not clean code but work and the most easy and I want to try it. I'm sorry.
        } while (basic > 1);
        System.out.println("do: "+factorial);

    }
}
