package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task03ReverseArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String elements = scanner.nextLine();

        int [] elementsArr = Arrays.stream(elements.split(",")).mapToInt(Integer::parseInt).toArray();
        int [] reversedArr = new int[number];

        int count = 0;
        for (int i = number - 1; i >= 0; i--) {
            reversedArr[i] = elementsArr[count];
            count++;
        }

        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}
