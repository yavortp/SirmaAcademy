package BasicSyntax;

import java.util.Scanner;

public class Task17GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());

        if (score >= 0 && score < 60) {
            System.out.println("F");
        } else if (score < 70) {
            System.out.println("D");
        } else if (score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else if (score <= 100) {
            System.out.println("A");
        }
    }
}
