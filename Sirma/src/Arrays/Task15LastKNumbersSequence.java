package Arrays;

import java.util.Scanner;

public class Task15LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        int [] numbersArr = new int[length];
        numbersArr[0] = 1;

        for (int i = 1; i < numbersArr.length; i++) {
            int sum = 0;
            int index = i - number;
            for (int j = 0; j < number; j++) {
                if (index >= 0) {
                    sum += numbersArr[index];
                }
                index++;
            }
            numbersArr[i] = sum;
        }

        for (int value : numbersArr) {
            System.out.print(value + " ");
        }
    }
}
