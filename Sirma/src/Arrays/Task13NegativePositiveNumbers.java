package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task13NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int smallestNum = Integer.MAX_VALUE;
        int [] newArr = new int[inputArr.length];

        for (int i = 0; i < newArr.length; i++) {
            int indexOfSmallest = 0;
            for (int j = 0; j < inputArr.length; j++) {
                if (inputArr[j] < smallestNum) {
                    smallestNum = inputArr[j];
                    indexOfSmallest = j;
                }
            }
            inputArr[indexOfSmallest] = Integer.MAX_VALUE;
            newArr[i] = smallestNum;
            smallestNum = Integer.MAX_VALUE;
        }

        for (int value : newArr) {
            System.out.println(value);
        }
    }
}
