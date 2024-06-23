package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task16ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int length = 0;
        if (inputArr.length % 2 == 0) {
            length = inputArr.length / 2;
        } else {
            length = inputArr.length / 2 + 1;
        }

        int [] newArr = new int[length];

        int index = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (i % 2 != 0) {
                newArr[index] = inputArr[i] * 2;
                index++;
            }
        }

        for (int i = 0; i < newArr.length / 2; i++) {
            int oldNumber = newArr[i];
            newArr[i] = newArr[newArr.length - 1 - i];
            newArr[newArr.length - 1 - i] = oldNumber;
        }

        for (int value : newArr) {
            System.out.print(value + " ");
        }
    }
}
