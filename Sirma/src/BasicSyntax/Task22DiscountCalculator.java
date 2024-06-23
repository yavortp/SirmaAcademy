package BasicSyntax;

import java.util.Scanner;

public class Task22DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String membershipCard = scanner.nextLine();

        if (age < 18) {
            System.out.println("10% discount");
        } else if (age >= 18 && age <= 64) {
            if (membershipCard.equals("Yes")) {
                System.out.println("20% discount");
            } else if (membershipCard.equals("No")) {
                System.out.println("10% discount");
            }
        } else if (age >= 65) {
            System.out.println("30% discount");
        }
    }
}
