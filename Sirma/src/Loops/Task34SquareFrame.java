package Loops;

import java.util.Scanner;

public class Task34SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            if (i == 1 || i == input) {
                for (int j = 1; j <= input ; j++) {
                    if (j == 1) {
                        System.out.print("+");
                    } else if (j == input){
                        System.out.print(" +");
                    } else {
                        System.out.print(" -");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= input ; j++) {
                    if (j == 1) {
                        System.out.print("|");
                    } else if (j == input){
                        System.out.print(" |");
                    } else {
                        System.out.print(" -");
                    }
                }
                System.out.println();
            }
        }
    }
}
