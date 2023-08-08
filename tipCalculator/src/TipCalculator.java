import java.util.ArrayList;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        System.out.println("Type prices and a tip between 10 and 80!.");
        ArrayList<Integer> priceList = getPrices();
        int[] prices = new int[priceList.size()];
        int tip = 0;
        for (int i = 0; i < priceList.size(); i++) {
            if (i == priceList.size() - 1) {
                tip = priceList.get(i);

            } else {
                prices[i] = priceList.get(i);
            }
        }

        System.out.printf("Tip amount: %.2f%n", calculateTip(prices, tip));
    }

    static int checkTip(int tip) {
        if (tip >= 10 && tip <= 80) {
            return tip;
        } else {
            return -1;
        }
    }

    static ArrayList<Integer> getPrices() {
        ArrayList<Integer> priceListPlusTip = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int price;
        do {
            price = scan.nextInt();
            priceListPlusTip.add(price);

        } while (price > 100);

        return priceListPlusTip;
    }

    static double calculateTip(int[] prices, int tipPercent) {
        double amount = 0;
        tipPercent = checkTip(tipPercent);
        if (tipPercent == -1) {
            amount = -1;

        } else {
            for (int price : prices) {
                amount += price;
            }
            amount *= (double) tipPercent / 100;
        }
        return amount;
    }
}
