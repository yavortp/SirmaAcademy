package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task14FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = Integer.parseInt(scanner.nextLine());
        int [] inputArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < elements; i++) {
            System.out.print(inputArr[i] + " ");
        }
        System.out.println();

        int index = inputArr.length - elements;

        for (int i = index; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }
}
