import java.util.Scanner;

public class HeavenNumbers {
    public static void main(String[] args) {
        boolean heaven = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int userNumber = scan.nextInt();

        if (userNumber % 2 == 0 && userNumber < 100 && userNumber % 7 != 0) {
            heaven = true;
        } else {
            if (userNumber > 300 && userNumber % 13 == 0) {
                byte divisorPc = 0;
                int i = 2;
                while (divisorPc < 9 && i <= (userNumber / 2)) {

                    if (userNumber % i == 0) {
                        //System.out.println(i);
                        divisorPc++;
                        if (divisorPc == 9) {
                            heaven = true;
                        }
                    }
                    i++;
                }
            }
        }
        System.out.println("Is your number a heaven number? " + heaven);
        scan.close();

    }
}
