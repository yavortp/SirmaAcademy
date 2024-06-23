package Loops;

import java.util.Scanner;

public class Task12PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int fibonacciSum = 1;
        int previousNum = 0;
        int nextNum = 0;
        int currentNum = 1;

        for (int i = 1; i < number; i++) {
            previousNum = nextNum;
            nextNum = currentNum;
            currentNum = previousNum + nextNum;
            fibonacciSum += currentNum;
        }

        System.out.println(fibonacciSum);
    }
}
