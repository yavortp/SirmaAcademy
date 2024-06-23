package BasicSyntax;

import java.util.Scanner;

public class Task25AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String leftHandTool = scanner.nextLine();
        String rightHandTool = scanner.nextLine();

        if (leftHandTool.equals("sword") || rightHandTool.equals("sword")) {
            if (leftHandTool.equals("sword")) {
                if (rightHandTool.equals("shield")) {
                    System.out.println("Take the path to the castle");
                } else {
                    System.out.println("Take the path to the forest");
                }
            }
            if (rightHandTool.equals("sword")) {
                if (leftHandTool.equals("shield")) {
                    System.out.println("Take the path to the castle");
                } else {
                    System.out.println("Take the path to the forest");
                }
            }
        } else if (leftHandTool.equals("map") || rightHandTool.equals("map")) {
            if (leftHandTool.equals("map")) {
                if (rightHandTool.equals("coins")) {
                    System.out.println("Go to the town");
                } else {
                    System.out.println("Camp at current spot and prepare for the next day");
                }
            }
            if (rightHandTool.equals("map")) {
                if (leftHandTool.equals("coins")) {
                    System.out.println("Go to the town");
                } else {
                    System.out.println("Camp at current spot and prepare for the next day");
                }
            }
        } else {
            System.out.println("Wander aimlessly");
        }
    }
}
