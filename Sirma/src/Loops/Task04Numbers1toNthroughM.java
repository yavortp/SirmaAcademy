package Loops;

import java.util.Scanner;

public class Task04Numbers1toNthroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int step = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i += step) {
            System.out.println(i);
        }
    }
}
