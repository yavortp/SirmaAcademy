package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task20LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int biggestCount = Integer.MIN_VALUE;
        int longCount = 1;
        int sequenceValue = 0;
        for (int index = 0; index <= array.length - 1; index++) {
            int currentValue = array[index];

            for (int i = index + 1; i <= array.length - 1 ; i++) {
                if (currentValue == array[i]){
                    longCount++;
                    if (longCount > biggestCount) {
                        biggestCount = longCount;
                        sequenceValue = array[index];
                    }
                } else {
                    longCount = 1;
                    break;
                }
            }
            longCount = 1;
        }

        for (int i = 1; i <= biggestCount; i++) {
            System.out.print(sequenceValue + " ");
        }
    }
}
