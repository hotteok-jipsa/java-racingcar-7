package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.dto.CarDto;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public void moveCars() {
        for (Car car : cars) {
            car.move(getRandomNumber());
        }
    }

    public void registerCar(String rawCars) {
        String[] tokens = rawCars.split(",");
        for (String carName : tokens) {
            cars.add(new Car(carName));
        }
    }

    public List<CarDto> getCarDtos() {
        return cars.stream()
                .map(Car::getCarDto)
                .collect(Collectors.toList());
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
