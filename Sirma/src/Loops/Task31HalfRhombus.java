package Loops;

import java.util.Scanner;

public class Task31HalfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int lowerRhombusHalf = input - 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i ; j++) {
                if (j == i) {
                    System.out.println('*');
                } else {
                    System.out.print("* ");
                }
            }
        }

        for (int i = lowerRhombusHalf; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    System.out.println('*');
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
