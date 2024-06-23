package Loops;

import java.util.Scanner;

public class Task11NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int reversed = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }

        System.out.println(reversed);
    }
}
