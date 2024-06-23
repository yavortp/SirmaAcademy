package Methods;

import java.util.Scanner;

public class Task10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        multiplyAndPrintResult(input);
    }

    public static void multiplyAndPrintResult(int number) {
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0) {
            int lastNum = number % 10;
            number /= 10;
            if (lastNum % 2 == 0) {
                evenSum += lastNum;
            } else {
                oddSum += lastNum;
            }
        }
        System.out.println(evenSum * oddSum);
    }
}
