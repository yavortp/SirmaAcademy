package Methods;

import java.util.Scanner;

public class Task01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printSignOfInt(input);

    }

    public static void printSignOfInt (int number) {
        if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
