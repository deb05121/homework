public class StringSmallExercise {
    public static void main(String[] args) {
        String str = "hello_bBffF_hello_G_ddbB_hello";

        byte counterOfChar = countB(str);

        byte counterOfSubStr = helloCount(str);
        System.out.println(counterOfChar);
        System.out.println(counterOfSubStr);
    }

    static byte helloCount(String str) {
        byte presence = 0;
        int subLength = 5;
        if (subLength <= str.length()) {
            int i = 0;
            do {
                String subStr = str.substring(i, i + subLength);

                if (subStr.equals("hello")) {
                    presence++;
                }
                i++;
            } while (i <= str.length() - subLength);
        }
        return presence;
    }

    static byte countB(String str) {
        byte piecesOfChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'B') {
                piecesOfChar++;
            }
        }
        return piecesOfChar;
    }
}
