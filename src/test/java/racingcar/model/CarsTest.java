package racingcar.model;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarsTest {

    private static final int MOVE_NUMBER = 9;

    @Test
    void 가장_멀리_이동한_자동차들을_계산한다() {
        Car car1 = new Car("a");
        Car car2 = new Car("b");
        Car car3 = new Car("c");

        car1.move(MOVE_NUMBER);
        car2.move(MOVE_NUMBER);

        Cars cars = new Cars();
        cars.registerCar(car1);
        cars.registerCar(car2);
        cars.registerCar(car3);

        assertThat(cars.getFarthestCars())
                .containsOnly(car1.getCarDto(), car2.getCarDto());
    }
}
