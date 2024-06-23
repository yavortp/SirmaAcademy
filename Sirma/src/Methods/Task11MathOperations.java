package Methods;

import java.util.Scanner;

public class Task11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double num2 = Double.parseDouble(scanner.nextLine());

        calculateResult(num1, operator, num2);
    }

    public static void calculateResult (double num1, String operator, double num2) {
        double result = 0;
        switch (operator) {
            case "/" -> result = num1 / num2;
            case "*" -> result = num1 * num2;
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
        }

        System.out.printf("%.02f", result);
    }
}
