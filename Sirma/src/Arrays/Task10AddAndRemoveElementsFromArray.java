package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split(",");

        int countCommands = command.length;
        int countRemove = 0;

        for (int i = 0; i < command.length; i++) {
            String currentCommand = command[i];
            if (currentCommand.equals("remove")) {
                countRemove++;
            }
        }

        int newLength = command.length - countRemove * 2;

        if (newLength <= 0) {
            System.out.println("Empty");
        } else {
            int [] printArr = new int[newLength];
            int counter = 1;
            int remove = 0;
            for (int i = 0; i < command.length; i++) {
                String currentCommand = command[i];
                if (currentCommand.equals("add")) {
                    printArr[counter - 1] = i + 1 - remove;
                    counter++;
                } else {
                    counter -= 1;
                    remove++;
                }
            }
            for (int num : printArr) {
                System.out.print(num + " ");
            }
        }
    }
}
