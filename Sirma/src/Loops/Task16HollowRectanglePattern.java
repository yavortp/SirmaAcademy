package Loops;

import java.util.Scanner;

public class Task16HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rows ; i++) {
            if (i == 1 || i == rows) {
                for (int j = 1; j <= columns; j++) {
                    System.out.print("*");
                    if (j == columns) {
                        System.out.println();
                    }
                }
            } else {
                for (int j = 1; j <= columns; j++) {
                    if (j == 1 || j == columns) {
                        System.out.print("*");
                        if (j == columns) {
                            System.out.println();
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }


    }
}
