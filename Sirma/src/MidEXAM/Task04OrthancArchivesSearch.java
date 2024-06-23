package MidEXAM;

import java.util.Scanner;

public class Task04OrthancArchivesSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        String itemToSearch = scanner.nextLine();

        int firstOccurrence = 0;
        boolean isFirstOccurred = false;
        int lastOccurrence = 0;
        for (int i = 0; i < input.length; i++) {
            String currentItem = input[i];

            if (currentItem.equals(itemToSearch) && !isFirstOccurred) {
                firstOccurrence = i;
                isFirstOccurred = true;
            }
            if (currentItem.equals(itemToSearch) && lastOccurrence <= i) {
                lastOccurrence = i;
            }
        }

        if (!isFirstOccurred) {
            System.out.println("Record not found");
        } else {
            System.out.println("First Occurrence: " + firstOccurrence);
            System.out.println("Last Occurrence: " + lastOccurrence);
        }
    }
}
