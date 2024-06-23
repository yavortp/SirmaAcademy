package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task07EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        int [] firstArr = Arrays.stream(firstInput.split(",")).mapToInt(Integer::parseInt).toArray();
        int [] secondArr = Arrays.stream(secondInput.split(",")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int index = 0;
        boolean isEqual = true;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
            } else {
                isEqual = false;
                index = i;
            }
        }

        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index", index);
        }
    }
}
