package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task06EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int [] numbersArr = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];
            } else {
                oddSum += numbersArr[i];
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
