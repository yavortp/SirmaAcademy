package Methods;

import java.util.Scanner;

public class Task08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        calculateMathPower(number, power);
    }

    public static void calculateMathPower(double num, double power) {
        double result = Math.pow(num, power);

        System.out.printf("%.02f", result);
    }
}
