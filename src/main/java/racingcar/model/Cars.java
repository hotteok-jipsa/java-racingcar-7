package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public void registerCar(String rawCars) {
        String[] tokens = rawCars.split(",");
        for (String carName : tokens) {
            cars.add(new Car(carName));
        }
    }

}
