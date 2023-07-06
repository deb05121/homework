import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SquareListener {
    public static void main(String[] args) {
        //1. Scanner
        int userNumber = scanUserNumber();
        //2. define the limit
        int limit = (int) Math.sqrt(userNumber);
        //3. square listener
        int[] squareList = makeSqrList(limit);
        //4. print
        for (int sqr : squareList
        ) {
            System.out.print(sqr + ", ");
        }

    }

    static int scanUserNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = scan.nextInt();
        return number;
    }

    static int[] makeSqrList(int limit) {
        int[] sqrList = new int[limit];
        for (int i = 0; i < limit; i++) {
            sqrList[i] = ((i + 1) * (i + 1));
        }
        return sqrList;
    }
}
