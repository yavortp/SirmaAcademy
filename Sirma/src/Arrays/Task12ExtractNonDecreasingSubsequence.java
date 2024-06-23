package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task12ExtractNonDecreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int removeNumbers = 0;
        int firstNum = inputArr[0];
        int biggestNum = 0;
        int previousNum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < biggestNum) {
                inputArr[i] = firstNum;
                removeNumbers++;
            } else {
                biggestNum = inputArr[i];
            }

            previousNum = inputArr[i];
        }

        int[] newArr = new int[inputArr.length - removeNumbers];
        newArr[0] = firstNum;
        int index = 1;
        for (int i = 1; i < inputArr.length; i++) {
            if (inputArr[i] != firstNum) {
                newArr[index] = inputArr[i];
                index++;
            }
        }

        for (int value : newArr) {
            System.out.print(value + " ");
        }
    }
}
