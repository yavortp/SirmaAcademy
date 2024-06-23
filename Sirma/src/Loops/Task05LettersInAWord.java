package Loops;

import java.util.Scanner;

public class Task05LettersInAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            System.out.println(currentChar);
        }
    }
}
