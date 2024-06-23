package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task05SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int [] inputArr = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 == 0) {
                sum += inputArr[i];
            }
        }

        System.out.println(sum);
    }
}
