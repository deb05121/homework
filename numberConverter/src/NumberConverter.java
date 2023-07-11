import java.util.Scanner;

public class NumberConverter {

    //input: egy szám 1 és 999 között
    //output: az angol kiírása a számnak
    //  1 --> one
    // 10 --> ten
    // 52 --> fifty-two
    // 101 --> one hundred one
    // 119 --> one hundred nineteen
    // 115 --> one hundred fifteen
    // 125 --> one hundred twenty-five
    // 220 --> two hundred twenty

    private static final String[] ONE_TO_NINETEEN = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TWENTY_TO_NINETY = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String HUNDRED = "hundred";
    private static final String HYPHEN = "-";

    private static final String[] THOUSANDS = {"", "thousand", "million", "billion"};

    // nine hundred ninety-nine billion nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        long userNumber = scanner.nextLong();
        long number = userNumber;
        int[] groups = new int[4];
        int i = 0;
        String numberInEnglish = "";
        while (number > 0) {
            number /= 1000;
            groups[i] = (int) (userNumber - number * 1000);
            userNumber = number;
            i++;
        }
        for (int j = groups.length - 1; j >= 0; j--) {

            if(groups[j]>0){
                numberInEnglish += threeDigitNumber(groups[j]);
                numberInEnglish += " " + THOUSANDS[j] + " ";
            }
        }
        System.out.println(numberInEnglish);
        scanner.close();
    }

    static String threeDigitNumber(int number) {

        String numberInEnglish = "";
        if (number > 100) {
            int hundreds = number / 100; //number = 245 --> hundreds = 2
            numberInEnglish += ONE_TO_NINETEEN[hundreds] + " " + HUNDRED;
            number -= hundreds * 100; // 245 --> 45
        }
        //a) semmit nem kell csinálni, ha százzal osztható
        //b) ha 20-nál nagyobb vagy egyenlő, kiszedek egy értéket a tizesekből, és ha marad szám, kötőjellel hozzákötöm az egyesekből a megfelelőt
        //c) ha 20-nál kevesebb, akkor az egyesekből szedem ki
        if (number >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[number / 10];
            //78 --> 8
            //53 --> 3
            //99 --> 9
            //66 --> 6
            //21 --> 1
            number %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[number];
        } else {
            numberInEnglish += " " + ONE_TO_NINETEEN[number];
        }
        //800
        //801, 805, 811, 819 --> eight hundred one / five / eleven / nineteen
        //820 --> eight hundred twenty
        //822 --> eight hundred twenty-two

        return numberInEnglish;
    }
}
