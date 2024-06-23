package Loops;

import java.util.Scanner;

public class Task20RageExpences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0;

        for (int games = 1; games <= lostGames; games++) {
            if (games % 2 == 0) {
                expenses += headsetPrice;
            }
            if (games % 3 == 0) {
                expenses += mousePrice;
            }
            if (games % 6 == 0) {
                expenses += keyboardPrice;
            }
            if (games % 12 == 0) {
                expenses += displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
