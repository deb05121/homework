package solutions;

import java.util.*;


public class Solution01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();

            int sum = ((6+(((n-1)/3)-1)*3)*((n-1)/3))/2 + ((10+(((n-1)/5)-1)*5)*((n-1)/5))/2 - ((30+(((n-1)/15)-1)*15)*((n-1)/15))/2;
            System.out.println(sum);
        }
    }
}