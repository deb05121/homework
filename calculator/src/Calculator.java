import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("What do you wanna do: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modular division");
        System.out.println("6 - Power");
        System.out.println("7 - Percentage");
        System.out.println("8 - Factorial");
        System.out.println("9 - Square root");

        Scanner scanner = new Scanner(System.in);
        boolean isNotValidNumber = true;
        byte number;
        do {
            number = getNumber(scanner);
            if (number > 0 && number < 10) {
                isNotValidNumber = false;
            } else {
                System.out.println("Not valid number! Try again!");
            }
        } while (isNotValidNumber);
        switch (number) {
            case 1:
                performAddition(scanner);
                break;
            case 2:
                performSubtraction(scanner);
                break;
            case 3:
                performMultiplication(scanner);
                break;
            case 4:
                performDivision(scanner);
                break;
            case 5:
                performModularDivision(scanner);
                break;
            case 6:
                performPower(scanner);
                break;
            case 7:
                performPercentage(scanner);
                break;
            case 8:
                performFactorialCalculation(scanner);
                break;
            case 9:
                performSquareRoot(scanner);
                break;
            default:
        }
        scanner.close();
    }

    static void performSquareRoot(Scanner scanner) {
        System.out.println("Please type a number");
        int num = scanner.nextInt();
        System.out.println(squareRoot(num));
    }

    static double squareRoot(int num) {
        return Math.sqrt(num);
    }

    static void performPercentage(Scanner scanner) {
        System.out.println("Please type a ground number");
        int num1 = scanner.nextInt();
        System.out.println("Please type the percentage (%)");
        int num2 = scanner.nextInt();
        System.out.println(percentage(num1, num2));
    }

    static double percentage(int num1, int num2) {
        return num1 * (num2 / 100.0);
    }

    static void performPower(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(power(num1, num2));
    }

    static double power(int ground, int exponent) {
        double pow = 1;
        if (exponent == 0) {
            return pow;
        }

        for (int i = 0; i < Math.abs(exponent); i++) {
            pow *= ground;
        }

        if (exponent < 0) {
            pow = 1 / pow;
        }
        return pow;
    }

    static void performModularDivision(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(modularDivision(num1, num2));
    }

    static int modularDivision(int num1, int num2) {
        return num1 % num2;
    }

    static void performDivision(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(division(num1, num2));
    }

    static double division(int num1, int num2) {
        double d1 = num1;
        double d2 = num2;
        return d1 / d2;
    }

    static void performMultiplication(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(multiplication(num1, num2));
    }

    static long multiplication(int num1, int num2) {
        return num1 * num2;
    }

    static void performFactorialCalculation(Scanner scanner) {
        System.out.println("Please type a number");
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }

    static long factorial(int num) {
        //2! = 1*2
        //5! = 1*2*3*4*5
        long factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    static void performSubtraction(Scanner scanner) {
        System.out.println("Please type two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(difference(num1, num2));
    }

    static int difference(int num1, int num2) {
        return num1 - num2;
    }

    static void performAddition(Scanner scanner) {
        System.out.println("Please type two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static byte getNumber(Scanner scanner) {
        return scanner.nextByte();
    }
}