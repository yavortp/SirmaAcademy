package BasicSyntax;

import java.util.Scanner;

public class Task13VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vegetable = scanner.nextLine();
        String weekDay = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double cost = 0;
        boolean isValid = true;

        if (weekDay.equals("Monday") || weekDay.equals("Tuesday") || weekDay.equals("Wednesday") || weekDay.equals("Thursday") || weekDay.equals("Friday")) {
            switch (vegetable) {
                case "tomato":
                    cost = quantity * 2.5;
                    break;
                case "onion":
                    cost = quantity * 1.2;
                    break;
                case "lettuce":
                    cost = quantity * 0.85;
                    break;
                case "cucumber":
                    cost = quantity * 1.45;
                    break;
                case "pepper":
                    cost = quantity * 5.5;
                    break;
                default:
                    isValid = false;
                    System.out.println("error");
                    break;
            }
        } else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
            switch (vegetable) {
                case "tomato":
                    cost = quantity * 2.8;
                    break;
                case "onion":
                    cost = quantity * 1.3;
                    break;
                case "lettuce":
                    cost = quantity * 0.85;
                    break;
                case "cucumber":
                    cost = quantity * 1.75;
                    break;
                case "pepper":
                    cost = quantity * 3.5;
                    break;
                default:
                    isValid = false;
                    System.out.println("error");
                    break;
            }
        } else {
            isValid = false;
            System.out.println("error");
        }
        
        if (isValid){
            System.out.printf("%.2f", cost);
        }
    }
}
