package BasicSyntax;

import java.util.Scanner;

public class Task15MakeUpShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double renovationCost = Double.parseDouble(scanner.nextLine());
        int powdersCount = Integer.parseInt(scanner.nextLine());
        int lipsticksCount = Integer.parseInt(scanner.nextLine());
        int spiralsCount = Integer.parseInt(scanner.nextLine());
        int shadowsCount = Integer.parseInt(scanner.nextLine());
        int correctorsCount = Integer.parseInt(scanner.nextLine());

        int totalOrderCount = powdersCount + lipsticksCount + spiralsCount + shadowsCount + correctorsCount;

        double powdersPrice = powdersCount * 2.6;
        double lipsticksPrice = lipsticksCount * 3;
        double spiralsPrice = spiralsCount * 4.1;
        double shadowsPrice = shadowsCount * 8.2;
        double correctorsPrice = correctorsCount * 2;

        double orderCost = powdersPrice + lipsticksPrice + spiralsPrice + shadowsPrice + correctorsPrice;

        if (totalOrderCount >= 50) {
            orderCost *= 0.75;
        }

        orderCost -= orderCost * 0.1;

        double money = Math.abs(orderCost - renovationCost);

        if (orderCost >= renovationCost) {
            System.out.printf("Yes! " + "%.2f" + " lv left.", money);
        } else {
            System.out.printf("Not enough money! " + "%.2f" + " lv needed.", money);
        }
    }
}
