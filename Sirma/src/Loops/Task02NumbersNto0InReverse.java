package Loops;

import java.util.Scanner;

public class Task02NumbersNto0InReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i >= 1 ; i--) {
            System.out.println(number);
            number -= 1;
        }
    }
}
