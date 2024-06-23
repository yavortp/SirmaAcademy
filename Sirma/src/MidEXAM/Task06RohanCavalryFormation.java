package MidEXAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task06RohanCavalryFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> formation = new ArrayList<>(Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String [] currentCommand = command.split(" ");
            String action = currentCommand[0];

            switch (action) {
                case "destroy":
                    int destroyIndex = Integer.parseInt(currentCommand[1]);
                    if (isValidIndexToDestroy(destroyIndex, formation.size())) {
                        formation.remove(destroyIndex);
                    }
                    break;
                case "swap":
                    int swapIndex1 = Integer.parseInt(currentCommand[1]);
                    int swapIndex2 = Integer.parseInt(currentCommand[2]);
                    if (isValidIndexToSwap(swapIndex1, swapIndex2, formation.size())) {
                        int firstID = formation.get(swapIndex1);
                        int secondID = formation.get(swapIndex2);
                        formation.remove(swapIndex1);
                        formation.add(swapIndex1, secondID);
                        formation.remove(swapIndex2);
                        formation.add(swapIndex2, firstID);
                    }
                    break;
                case "add":
                    int addID = Integer.parseInt(currentCommand[1]);
                    formation.addLast(addID);
                    break;
                case "insert":
                    int insertID = Integer.parseInt(currentCommand[1]);
                    int insertIndex = Integer.parseInt(currentCommand[2]);
                    if (insertIndex == formation.size()) {
                        formation.addLast(insertID);
                        break;
                    }
                    if (isValidIndexToDestroy(insertIndex, formation.size())) {
                        formation.add(insertIndex, insertID);
                    }
                    break;
                case "center":
                    if (formation.isEmpty() || formation.size() <= 2) {
                        break;
                    }
                    List<Integer> centerList = new ArrayList<>();
                    if (formation.size() % 2 == 0) {
                        centerList.add(formation.get(formation.size() / 2 - 1));
                        centerList.add(formation.get(formation.size() / 2));
                    } else {
                        centerList.add(formation.get(formation.size() / 2));
                    }

                    for (int element : centerList) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;
            }

            if (!action.equals("center")) {
                for (int element : formation) {
                    System.out.print(element + " ");
                }
                System.out.println();

            }

            command = scanner.nextLine();
        }

    }

    public static boolean isValidIndexToDestroy (int index, int formationSize) {
        if (index < 0 || index > formationSize - 1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isValidIndexToSwap (int index1, int index2, int formationSize) {
        if ((index1 < 0 || index1 > formationSize - 1) || (index2 < 0 || index2 > formationSize - 1)) {
            return false;
        } else {
            return true;
        }
    }

}
