package BasicSyntax;

import java.util.Scanner;

public class Task28ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double latitude = Double.parseDouble(scanner.nextLine());
        String hemisphere = scanner.nextLine();

        latitude = Math.abs(latitude);

        if (latitude > 66.5 && latitude <= 90) {
            System.out.println("Arctic Zone");
        } else if (latitude > 23.5 && latitude <= 66.5) {
            System.out.println("Temperate Zone");
        } else if (latitude > 0 && latitude <= 23.5) {
            System.out.println("Tropic Zone");
        } else if (latitude == 0) {
            System.out.println("Equator");
        } else {
            System.out.println("wrong latitude input");
        }
    }
}
