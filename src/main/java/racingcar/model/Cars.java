package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
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

    public void registerCar(final Car car) {
        cars.add(car);
    }

    public List<CarDto> getFarthestCars() {
        int maxPosition = Collections.max(cars).getPosition();
        List<CarDto> winnerCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winnerCars.add(car.getCarDto());
            }
        }
        return winnerCars;
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
