package MidEXAM;

import java.util.Scanner;

public class Task01CountingOrcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialCount = Integer.parseInt(scanner.nextLine());
        int increase = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= hours; i++) {
            sum += initialCount;
            initialCount += increase;
        }

        System.out.println(sum);
    }
}
