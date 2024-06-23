package Arrays;

import java.util.Scanner;

public class Task18ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] productsArr = scanner.nextLine().split(", ");

        String [] printArr = new String[productsArr.length];

        for (int i = 0; i < productsArr.length; i++) {

            String smallestString = "zzz";
            int index = 0;

            for (int j = 0; j < productsArr.length; j++) {
                char currentWord = productsArr[j].charAt(0);

                if (currentWord < smallestString.charAt(0)) {
                    smallestString = productsArr[j];
                    index = j;
                }

            }
            printArr[i] = smallestString;
            productsArr[index] = "zzz";
        }

        int num = 1;
        for (String value : printArr) {
            System.out.println(num + "." + value);
            num++;
        }
    }
}
