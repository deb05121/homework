import java.util.ArrayList;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        System.out.println("Type prices or zero if it isn't any more.");
        ArrayList<Integer> priceList = getPrices();
        System.out.println("Type percent of tip between 10 and 80!");
        int tipPercent = getTip();
        double amount = calculateTip(priceList, tipPercent);
        System.out.println(amount);
    }

    static int getTip() {
        int tipPercent = 0;
        Scanner scan = new Scanner(System.in);
        do {
            int tip = scan.nextInt();
            if (tip > 10 && tip < 80) {
                tipPercent = tip;
            } else {
                tipPercent = -1;
            }
        } while (tipPercent == 0);
        scan.close();
        return tipPercent;
    }

    static ArrayList<Integer> getPrices() {
        ArrayList<Integer> priceList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int price = 0;
        do {
            price = scan.nextInt();
            if (price > 0) {
                priceList.add(price);
            }
        } while (price != 0);

        return priceList;
    }

    static double calculateTip(ArrayList<Integer> priceList, int tipPercent) {
        double amount = 0;
        for (int i = 0; i < priceList.size(); i++) {
            amount += priceList.get(i);
        }
        if (tipPercent == -1) {
            amount = -1;
        } else {
            amount *= (double) tipPercent / 100;
        }
        return amount;
    }



}
