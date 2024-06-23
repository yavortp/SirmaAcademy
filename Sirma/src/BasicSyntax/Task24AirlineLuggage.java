package BasicSyntax;

import java.util.Scanner;

public class Task24AirlineLuggage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int dimensions = Integer.parseInt(scanner.nextLine());

        int fee = 0;
        boolean isOverweight = false;
        boolean isOversize = false;

        if (wight > 50) {
            isOverweight = true;
            fee = 100;
        }
        if (dimensions > 158 && dimensions <= 178) {
            isOversize = true;
            fee += 50;
            if (isOverweight) {
                fee += 50;
            }
        } else if (dimensions > 178 && dimensions <= 208) {
            isOversize = true;
            fee += 100;
            if (isOverweight) {
                fee += 50;
            }
        } else if (dimensions > 208) {
            isOversize = true;
            fee += 200;
            if (isOverweight) {
                fee += 50;
            }
        }

        if (isOverweight && isOversize) {
            System.out.printf("$" + "%d" + " (Overweight + Oversize + Handling)", fee);
        } else if (isOverweight) {
            System.out.printf("$" + "%d" + " (Overweight)", fee);
        } else if (isOversize) {
            System.out.printf("$" + "%d" + " (Oversize)", fee);
        }
    }
}
