package Loops;

import java.util.Scanner;

public class Task32RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        if (input % 2 == 0) {
            input++;
        }

        int spaces = input / 2;
        int asterisks = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asterisks; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i <= input / 2) {
                spaces--;
                asterisks += 2;
            } else {
                spaces++;
                asterisks -=2;
            }
        }
    }
}
