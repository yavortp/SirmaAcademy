package Loops;

public class Task08MultiplicationTable {
    public static void main(String[] args) {

    int result = 0;

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 0; j <= 10; j++) {
                result = i * j;
                System.out.printf("%d * %d = %d%n", i , j, result);
            }
        }
    }
}
