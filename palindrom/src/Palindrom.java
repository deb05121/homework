import java.util.Scanner;

public class Palindrom {
    static Scanner scan = new Scanner(System.in);
    static boolean gameOver;

    public static void main(String[] args) {

        //1.
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        //2.
        boolean isNotValidNumber = true;
        String word = "";
        byte counter = 0;
        do {
            System.out.println("Type a word between 3 and 15 chars: ");
            Scanner scanner = new Scanner(System.in);
            word = getWord(scan);
            if ((word.length() < 3) || (word.length() > 15)) {
                System.out.println("Not valid word");
                counter++;
                if (counter == 5) {
                    System.out.println("you should listen more carefuly, word can be just at least 3 alfabets or at most 15 alfabets");
                }
                if (counter == 7) {
                    gameOver = true;
                }
            } else {
                isNotValidNumber = false;
            }
        } while (isNotValidNumber && !gameOver);

        //3. check palindrom
        if (!gameOver) {
            boolean isPalindrom = checkPalindrom(word);
            if (isPalindrom) {
                System.out.println(word + " is a palindrom!");
            } else {
                System.out.println(word + " isn't a palindrom!");
            }
            //4. Easter egg
            if (word.equals("madam")  || word.equals("racecar")) {
                System.out.println("This is an Easter egg!");
            }
            checkVovel(word);

        }

        System.out.println("game over, good bye");
        scan.close();
    }

    static void checkVovel(String word) {
        int vovelPiece = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            switch (c){
                case 'a' -> vovelPiece++;
                case 'e' -> vovelPiece++;
                case 'i' -> vovelPiece++;
                case 'o' -> vovelPiece++;
                case 'u' -> vovelPiece++;
            }
        }
        System.out.println("Vovel piece is " + vovelPiece);
        double percent = vovelPiece*100.0 / word.length();
        System.out.println("Vovel percent is " + ((int)percent) + "%");
    }

    static boolean checkPalindrom(String word) {

        int len = word.length() - 1;
        byte foreIndex = 0;
        byte endIndex = (byte) len;
        do {
            if (word.charAt(foreIndex) != word.charAt(endIndex)) {
                return false;
            } else {
                foreIndex++;
                endIndex--;
            }
        } while (foreIndex < endIndex);

        return true;
    }

    static String getWord(Scanner scan) {
        return scan.nextLine();
    }
}