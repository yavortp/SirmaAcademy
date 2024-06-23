package BasicSyntax;

import java.util.Scanner;

public class Task10Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double cost = 0;

        if (city.equals("Sofia")) {
            switch (product) {
                case "tea":
                    cost = quantity * 0.5;
                    break;
                case "water":
                    cost = quantity * 0.8;
                    break;
                case "juice":
                    cost = quantity * 1.2;
                    break;
                case "sweets":
                    cost = quantity * 1.45;
                    break;
                case "chips":
                    cost = quantity * 1.6;
                    break;
            }
        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "tea":
                    cost = quantity * 0.4;
                    break;
                case "water":
                    cost = quantity * 0.7;
                    break;
                case "juice":
                    cost = quantity * 1.15;
                    break;
                case "sweets":
                    cost = quantity * 1.3;
                    break;
                case "chips":
                    cost = quantity * 1.5;
                    break;
            }
        } else if (city.equals("Varna")) {
            switch (product) {
                case "tea":
                    cost = quantity * 0.45;
                    break;
                case "water":
                    cost = quantity * 0.7;
                    break;
                case "juice":
                    cost = quantity * 1.1;
                    break;
                case "sweets":
                    cost = quantity * 1.35;
                    break;
                case "chips":
                    cost = quantity * 1.55;
                    break;
            }
        }

        System.out.printf("%.2f", cost);
    }
}
