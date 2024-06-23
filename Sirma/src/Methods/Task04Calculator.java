package Methods;

import java.util.Scanner;

public class Task04Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case "add" -> addCalculationAndPrint(num1, num2);
            case "multiply" -> multiplyCalculationAndPrint(num1, num2);
            case "subtract" -> subtractCalculationAndPrint(num1, num2);
            case "divide" -> divideCalculationAndPrint(num1,num2);
        }
    }

    public static void addCalculationAndPrint(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
    public static void multiplyCalculationAndPrint(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }
    public static void subtractCalculationAndPrint(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }
    public static void divideCalculationAndPrint(int num1, int num2) {
        int result = num1 / num2;
        System.out.println(result);
    }
}
