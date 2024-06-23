package Loops;

import java.util.Scanner;

public class Task03Numbers1toNthrough2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i+=2) {
            System.out.println(i);
        }
    }
}
