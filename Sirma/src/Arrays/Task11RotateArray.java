package Arrays;

import java.util.Scanner;

public class Task11RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split(",");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {

            String lastElement = inputArr[inputArr.length - 1];

            for (int j = inputArr.length - 1; j >= 1; j--) {
                inputArr[j] = inputArr[j - 1];
            }

            inputArr[0] = lastElement;
        }

        for (String value : inputArr) {
            System.out.print(value + " ");
        }
    }
}
