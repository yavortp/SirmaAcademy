package Classes.Task01CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInputs = Integer.parseInt(scanner.nextLine());

        List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < numberInputs; i++) {
            String[] currentCar = scanner.nextLine().split(" ");

            String brand = currentCar[0];
            String model = currentCar[1];
            int horsePower = Integer.parseInt(currentCar[2]);

            Car newCar = new Car(brand, model, horsePower);
            carsList.add(newCar);
        }

        for (Car car : carsList) {
            System.out.println(car.carInfo());
        }
    }
}
