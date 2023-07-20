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
        int number = getNumber(scanner);
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
        System.out.println(SquareRoot(num));
    }

    static double SquareRoot(int num) {
        return Math.sqrt(num);
    }

    static void performPercentage(Scanner scanner) {
        System.out.println("Please type a ground number");
        int num1 = scanner.nextInt();
        System.out.println("Please type the percentage (%)");
        int num2 = scanner.nextInt();
        System.out.println(Percentage(num1, num2));
    }

    static double Percentage(int num1, int num2) {
        return num1*(num2/100.0);
    }

    static void performPower(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(Power(num1, num2));
    }

    static long Power(int num1, int num2) {
        long pow = 1;
        for (int i = 0; i < num2; i++) {
            pow *= num1;
        }
        return pow;
    }

    static void performModularDivision(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(ModularDivision(num1, num2));
    }

    static int ModularDivision(int num1, int num2) {
        return num1 % num2;
    }

    static void performDivision(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(Division(num1, num2));
    }

    static double Division(int num1, int num2) {
        return num1 / num2;
    }

    static void performMultiplication(Scanner scanner) {
        System.out.println("Please type a first number");
        int num1 = scanner.nextInt();
        System.out.println("Please type a second number");
        int num2 = scanner.nextInt();
        System.out.println(Multiplication(num1, num2));
    }

    static long Multiplication(int num1, int num2) {
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

    static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }
}