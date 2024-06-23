package Loops;

import java.util.Scanner;

public class Task10FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = 1;

        for (int i = number; i >= 1; i--) {
            result = result * i;
        }

        System.out.println(result);
    }
}
