package Loops;

import java.util.Scanner;

public class Task24Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int reversed = 0;

        while (input > 0) {
            int remainder = input % 10;
            reversed = reversed * 10 + remainder;
            input /= 10;

            if (remainder == 0) {
                System.out.println("ZERO");
            } else {
                char currentChar = (char) (33 + remainder);
                for (int i = 1; i <= remainder; i++) {
                    if (i == remainder) {
                        System.out.println(currentChar);
                    } else {
                        System.out.print(currentChar);
                    }
                }
            }

        }
    }
}
