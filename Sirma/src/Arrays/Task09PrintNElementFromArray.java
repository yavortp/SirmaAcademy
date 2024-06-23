package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09PrintNElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = (scanner.nextLine().split(","));
        int step = Integer.parseInt(scanner.nextLine());

        if (step > inputArr.length) {
            System.out.println(inputArr[0]);
        } else {
            int len = 0;
            if (inputArr.length % step == 0) {
                len = inputArr.length / 2;
            } else {
                len = (inputArr.length / 2) + 1;
            }

            String [] printArr = new String[len];

            int index = 0;
            for (int i = 0; i <= inputArr.length - 1; i += step) {
                printArr[index] = inputArr[i];
                index++;
            }

            System.out.println(String.join(" ", printArr));
        }
    }
}
