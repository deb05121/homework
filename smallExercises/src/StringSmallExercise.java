public class StringSmallExercise {
    public static void main(String[] args) {
        String str = "hello_bBffF_hello_G_ddbB_hello";
        char searchedChar= 'B';
        byte counterOfChar = countChar(str, searchedChar);
        String subStr = "hello";
        byte counterOfSubStr = countSubStr(str, subStr);
        System.out.println(counterOfChar);
        System.out.println(counterOfSubStr);
    }

    static byte countSubStr(String str, String subString) {
        byte presence = 0;
        int subLength = subString.length();
        if (subLength <= str.length()) {
            int i = 0;
            do {
                String subStr = str.substring(i, i + subLength);

                if (subStr.equals(subString)) {
                    presence++;
                }
                i++;
            } while (i <= str.length() - subLength);
        }
        return presence;
    }

    static byte countChar(String str, char searchedChar) {
        byte piecesOfChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == searchedChar) {
                piecesOfChar++;
            }
        }
        return piecesOfChar;
    }
}
