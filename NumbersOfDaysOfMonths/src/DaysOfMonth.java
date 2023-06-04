import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the serial number of month: (between 1 and 12)");
        int month = scan.nextInt();
        System.out.println("Number of days of the month:");
        switch (month) {
            case 2:
                System.out.println("28");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Error; fail the number");

        }
    }
}
