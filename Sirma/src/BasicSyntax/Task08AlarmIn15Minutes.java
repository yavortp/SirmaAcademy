package BasicSyntax;

import java.util.Scanner;

public class Task08AlarmIn15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes;
        int correctTime = totalMinutes + 15;

        int correctHours = correctTime / 60;
        int correctMinutes = correctTime % 60;

        if (correctHours > 23) {
            correctHours = 0;
        }

        System.out.printf("%d:%02d", correctHours, correctMinutes);
    }
}
