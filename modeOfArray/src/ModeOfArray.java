import java.util.Arrays;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] values = {3, 5, 1, 5, 5, 5, 1, 2, 2, 2, 3, 3};
        System.out.println(getMode(values));

    }

    static int getMode(int[] values) {
        //n = 5_000_000
        //O(n*log(n)) 5000000*6.69 művelet
        Arrays.sort(values);
        //1,1,2,2,2,3,5,40

        //currentFrequency
        //maxFrequency
        //mode

        if (values.length == 0) {
            return 0;
        }

        int currentFrequency = 1;
        int maxFrequency = 1;
        int mode = values[0];
        int currentValue = values[0];

        //O(n) 5000000 művelet
        //FIXME: fix indexing issues at the element
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] == currentValue) {
                currentFrequency++;
                if (((i + 1) == values.length - 1) && values[i + 1] == currentValue) {
                    currentFrequency++;
                }
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    if (mode != values[i]) {
                        mode = values[i];
                        
                    }
                }
            } else {
                currentFrequency = 1;
                currentValue = values[i];
            }
        }

        return mode;
    }
}
