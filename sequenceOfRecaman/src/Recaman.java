import java.util.Scanner;


public class Recaman {
    static int[] recaman;

    public static void main(String[] args) {
        System.out.println("Recamán's sequence. Type n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        recaman = new int[n + 1];

        if (n == 0) {    //FIND ELEMENTS OF SEQUENCE
            System.out.println(n);
        } else {
            for (int i = 1; i <= n; i++) {
                recaman[i] = nextElement(i);

            }
        }
        for (int i : recaman) {     //PRINT
            System.out.print(i + ", ");
        }
    }

    static int nextElement(int i) {
        int newElement = recaman[i - 1] - i; // BASIC OPERATION
        boolean exist = find(newElement);
        if ((newElement > 0) && !exist) {
            recaman[i] = newElement;

        } else {
            newElement = recaman[i - 1] + i; // ALTERNATIVE OPERATION

        }
        return newElement;
    }

    static boolean find(int elem) {

        boolean isNotEnd = true;
        boolean isFound = true;
        int j = 0;
        while (isNotEnd) {
            if (recaman[j] == elem) {
                return isFound;
            }
            j++;
            if (j == recaman.length) {
                isNotEnd = false;
            }
        }
        return !isFound;
    }
}
