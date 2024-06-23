package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task01ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(input[i]);
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
