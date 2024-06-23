package Classes.Task02CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintCarDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] currentCar = scanner.nextLine().split(" ");

            Car car;
            if (currentCar.length == 2) {
                car = new Car(currentCar[0], currentCar[1]);
            } else if (currentCar.length == 3) {
                car = new Car(currentCar[0], currentCar[1], Integer.parseInt(currentCar[2]));
            } else {
                car = new Car(currentCar[0]);
            }

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }

    }
}
