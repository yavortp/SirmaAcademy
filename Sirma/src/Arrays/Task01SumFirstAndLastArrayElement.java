package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] numbersArray = Arrays.stream(input.split(",")).mapToInt(value -> Integer.parseInt(value)).toArray();

        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if (i == 0 || i == numbersArray.length - 1) {
                sum += numbersArray[i];
            }
        }

        System.out.println(sum);
    }
}
