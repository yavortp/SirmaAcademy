package BasicSyntax;

import java.util.Scanner;

public class Task23MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        if (age < 13) {
            System.out.println("U-rated movies");
        } else if (age >= 13 && age <= 17) {
            System.out.println("U and PG-13 rated movies");
        } else if (age >= 18) {
            System.out.println("All movies");
        }
    }
}
