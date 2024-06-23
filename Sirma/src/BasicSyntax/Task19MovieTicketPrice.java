package BasicSyntax;

import java.util.Scanner;

public class Task19MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        if (age > 0 && age <= 12) {
            System.out.println("$5");
        } else if (age >= 13 && age <= 19) {
            System.out.println("$8");
        } else if (age >= 20) {
            System.out.println("$10");
        } else {
            System.out.println("wrong input");
        }
    }
}
