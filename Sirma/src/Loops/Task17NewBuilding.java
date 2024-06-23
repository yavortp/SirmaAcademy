package Loops;

import java.util.Scanner;

public class Task17NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        int topFloor = floors;
        int lastRoom = rooms;

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j <= rooms - 1; j++) {
                if (topFloor == i) {
                    System.out.printf("L%d" + j + " ", i);
                    if (lastRoom - 1 == j) {
                        System.out.println();
                    }
                } else {
                    if (i % 2 == 0) {
                        System.out.printf("O%d" + j + " ", i);
                    } else {
                        System.out.printf("A%d" + j + " ", i);
                    }
                    if (lastRoom - 1 == j) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
