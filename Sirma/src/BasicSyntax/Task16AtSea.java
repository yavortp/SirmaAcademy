package BasicSyntax;

import java.util.Scanner;

public class Task16AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        double cost = 0;

        if (days < 10) {
            switch (roomType) {
                case "single room":
                    cost = (days - 1) * 25;
                    break;
                case "apartment":
                    cost = (days - 1) * 50 * 0.7;
                    break;
                case "presidential":
                    cost = (days - 1) * 100 * 0.9;
                    break;
            }
        } else if (days <= 15) {
            switch (roomType) {
                case "single room":
                    cost = (days - 1) * 25;
                    break;
                case "apartment":
                    cost = (days - 1) * 50 * 0.65;
                    break;
                case "presidential":
                    cost = (days - 1) * 100 * 0.85;
                    break;
            }
        } else {
            switch (roomType) {
                case "single room":
                    cost = (days - 1) * 25;
                    break;
                case "apartment":
                    cost = (days - 1) * 50 * 0.5;
                    break;
                case "presidential":
                    cost = (days - 1) * 100 * 0.8;
                    break;
            }
        }

        if (assessment.equals("positive")) {
            cost += cost * 0.25;
        } else if (assessment.equals("negative")) {
            cost -= cost * 0.1;
        }

        System.out.printf("%.2f", cost);
    }
}
