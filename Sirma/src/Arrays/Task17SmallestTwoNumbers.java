package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task17SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int [] printArr = new int[2];

        for (int i = 0; i < 2 ; i++) {
            int smallestNum = Integer.MAX_VALUE;

            int index = 0;
            for (int j = 0; j < inputArr.length; j++) {
                if (inputArr[j] <= smallestNum) {
                    smallestNum = inputArr[j];
                    index = j;
                }
            }
            printArr[i] = smallestNum;
            inputArr[index] = Integer.MAX_VALUE;
        }

        for (int value : printArr) {
            System.out.print(value + " ");
        }
    }
}
