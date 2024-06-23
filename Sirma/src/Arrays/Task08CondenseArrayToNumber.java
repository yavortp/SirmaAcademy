package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task08CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        while (numArr.length > 1) {
            int [] condensedArr = new int[numArr.length - 1];
            for (int i = 0; i < condensedArr.length; i++) {
                condensedArr [i] = numArr[i] + numArr[i + 1];
            }
            numArr = condensedArr;
        }

        System.out.println(numArr[0]);
    }
}
