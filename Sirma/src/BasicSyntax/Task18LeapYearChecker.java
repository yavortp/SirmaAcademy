package BasicSyntax;

import java.util.Scanner;

public class Task18LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println("It's a leap year!");
        } else {
            System.out.println("It's not a leap year.");
        }
    }
}
