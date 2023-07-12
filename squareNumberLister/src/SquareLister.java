import java.util.ArrayList;
import java.util.Scanner;

public class SquareLister {
    public static void main(String[] args) {
        //1. Scanner
        int userNumber = scanUserNumber();
        //2. define the limit
        int limit = (int) Math.sqrt(userNumber);
        System.out.println("limit: " + limit);
        //3. square lister
        ArrayList<Integer> squareList = makeSqrList(limit);
        //4. print
            System.out.print(squareList);

    }

    static int scanUserNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = scan.nextInt();
        scan.close();
        return number;
    }

    static ArrayList<Integer> makeSqrList(int limit) {
        ArrayList<Integer> sqrList = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            sqrList.add((i + 1) * (i + 1));
        }
        return sqrList;
    }
}
