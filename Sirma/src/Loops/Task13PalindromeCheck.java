package Loops;

import java.util.Scanner;

public class Task13PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            reversed += currentChar;
        }

        if (input.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
