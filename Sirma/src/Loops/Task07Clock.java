package Loops;

public class Task07Clock {
    public static void main(String[] args) {

        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 59; j++) {
                System.out.printf("%d" + ":" + "%02d%n", i, j);
            }
        }
    }
}
