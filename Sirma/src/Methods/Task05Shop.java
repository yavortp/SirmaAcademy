package Methods;

import java.util.Scanner;

public class Task05Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printOrderPrice(product, quantity);
    }

    public static void printOrderPrice(String product, int quantity) {
        double coffeePrice = 1.5;
        double waterPrice = 1;
        double cokePrice = 1.4;
        double snacksPrice = 2;

        double price = 0;
        switch (product) {
            case "coffee" -> price = coffeePrice * quantity;
            case "water" -> price = waterPrice * quantity;
            case "coke" -> price = cokePrice * quantity;
            case "snacks" -> price = snacksPrice * quantity;
        }

        System.out.printf("%.02f", price);
    }
}
