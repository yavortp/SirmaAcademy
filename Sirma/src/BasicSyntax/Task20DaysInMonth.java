package BasicSyntax;

import java.util.Scanner;

public class Task20DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int days = 0;

        if (number > 0 && number < 13) {
            switch (number) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    days = 31;
                    System.out.println(days);
                }
                case 2 -> {
                    days = 28;
                    System.out.println(days);
                }
                case 4, 6, 9, 11 -> {
                    days = 30;
                    System.out.println(days);
                }
            }
        } else {
            System.out.println("Error!");
        }
    }
}
