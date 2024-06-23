package Loops;

import java.util.Scanner;

public class Task23NumbersTo1000EndingInN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i <= 1000; i += 10) {
            System.out.println(i);
        }
    }
}
