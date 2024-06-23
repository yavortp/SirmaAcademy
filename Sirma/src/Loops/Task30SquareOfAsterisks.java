package Loops;

import java.util.Scanner;

public class Task30SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (j == input) {
                    System.out.println('*');
                } else {
                    System.out.print('*');
                }
            }
        }
    }
}
