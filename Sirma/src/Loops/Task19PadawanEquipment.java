package Loops;

import java.util.Scanner;

public class Task19PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sumLightsabers = Math.ceil(countStudents * 1.1) * lightsaberPrice;
        double sumRobes = countStudents * robePrice;
        double sumBelts = 0;

        if (countStudents >= 6) {
            countStudents -= countStudents / 6;
            sumBelts = countStudents * beltPrice;
        } else {
            sumBelts = countStudents * beltPrice;
        }

        double moneyNeeded = sumLightsabers + sumRobes + sumBelts;

        if (moneyNeeded <= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        } else {
            double change = moneyNeeded - availableMoney;
            System.out.printf("George Lucas will need %.2flv more.", change);
        }
    }
}
