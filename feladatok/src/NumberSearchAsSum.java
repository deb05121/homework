import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSearchAsSum {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int x = 9;
        boolean isFindTwoNumberInArray = findCoupleOfNumber(numbers, x);
        System.out.println(isFindTwoNumberInArray);

    }

    static boolean findCoupleOfNumber(int[] numbers, int numberToCheck) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numberToCheck==(numbers[i]+numbers[j])){

                    return true;
                }
            }
        }
        return false;
    }

}
