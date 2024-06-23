package BasicSyntax;

import java.util.Scanner;

public class Task09AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();
        
        if (gender.equals("f")) {
            if (age <= 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else if (gender.equals("m")) {
            if (age <= 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        } else {
            System.out.println("wrong gender input");
        }
    }
}
