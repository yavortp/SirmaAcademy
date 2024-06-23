package Loops;

import java.util.Scanner;

public class Task09SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int counter = numbers * 2;
        int sum = 0;

        for (int i = 2; i <= counter; i += 2) {
            sum += i;
        }

        System.out.println(sum);
    }
}
