package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task19ArrayManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> workingList = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList());
        String [] commandsArr = scanner.nextLine().split(", ");

        for (int i = 0; i < commandsArr.length; i++) {
            String [] currentCommand = commandsArr[i].split(" ");
            String action = currentCommand[0];

            switch (action) {
                case "Add":
                    int newNum = Integer.parseInt(currentCommand[1]);
                    workingList.add(newNum);
                    break;
                case "Remove":
                    int removeNum = Integer.parseInt(currentCommand[1]);
                    workingList.remove((Integer) removeNum);
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(currentCommand[1]);
                    workingList.remove(index);
                    break;
                case "Insert":
                    int number = Integer.parseInt(currentCommand[1]);
                    int insertIndex = Integer.parseInt(currentCommand[2]);
                    workingList.add(insertIndex, number);
                    break;
            }
        }

        for (int value : workingList) {
            System.out.print(value + " ");
        }

    }
}
