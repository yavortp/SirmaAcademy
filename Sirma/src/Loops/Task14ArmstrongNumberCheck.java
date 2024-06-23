package Loops;

import java.util.Scanner;

public class Task14ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digitsCount = number;
        int originalNum = number;
        int digit = 0;
        int cubeSum = 0;
        int power = 0;

        while (digitsCount > 0) {
            digitsCount /= 10;
            power++;
        }

        while (number != 0) {
            digit = number % 10;
            cubeSum += Math.pow(digit, power);
            number /= 10;
        }

        if (cubeSum == originalNum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
