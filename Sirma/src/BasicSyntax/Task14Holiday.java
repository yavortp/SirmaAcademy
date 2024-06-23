package BasicSyntax;

import java.util.Scanner;

public class Task14Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double cost = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                cost = budget * 0.3;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - " + "%.2f", cost);
            } else if (season.equals("winter")) {
                cost = budget * 0.7;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - " + "%.2f", cost);
            }
        } else if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")) {
                cost = budget * 0.4;
                System.out.println("Somewhere in Europe");
                System.out.printf("Camp - " + "%.2f", cost);
            } else if (season.equals("winter")) {
                cost = budget * 0.8;
                System.out.println("Somewhere in Europe");
                System.out.printf("Hotel - " + "%.2f", cost);
            }
        } else if (budget > 1000) {
            cost = budget * 0.9;
            System.out.println("Somewhere in Asia");
            System.out.printf("Hotel - " + "%.2f", cost);
        } else {
            System.out.println("save some money!");
        }

    }
}
