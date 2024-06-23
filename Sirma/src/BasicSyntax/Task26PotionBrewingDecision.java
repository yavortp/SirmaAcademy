package BasicSyntax;

import java.util.Scanner;

public class Task26PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String leadingIngredient = scanner.nextLine();
        String additiveIngredient = scanner.nextLine();

        if (leadingIngredient.equals("herbs")) {
            if (additiveIngredient.equals("water")) {
                System.out.println("Health potion");
            } else if (additiveIngredient.equals("oil")) {
                System.out.println("Stealth potion");
            } else {
                System.out.println("Minor stamina potion");
            }
        } else if (leadingIngredient.equals("berries")) {
            if (additiveIngredient.equals("sugar")) {
                System.out.println("Speed potion");
            } else {
                System.out.println("Minor energy potion");
            }
        } else {
            System.out.println("No potion");
        }
    }
}
