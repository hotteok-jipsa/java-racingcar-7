package racingcar.model;

import static racingcar.ExceptionMessage.CAR_NAME_INVALID_EXCEPTION;

import racingcar.dto.CarDto;

public class Car implements Comparable<Car> {

    private static final int MINIMUM_NUMBER_TO_MOVE = 4;

    private final String name;

    private int position = 0;

    public Car(String name) {
        validateCarName(name);
        this.name = name;
    }

    public void move(int randomNumber) {
        if (randomNumber >= MINIMUM_NUMBER_TO_MOVE) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public CarDto getCarDto() {
        return new CarDto(
                name, position
        );
    }

    private void validateCarName(String name) {
        if (name.length() > 5 || name.isBlank()) {
            throw new IllegalArgumentException(CAR_NAME_INVALID_EXCEPTION.message);
        }
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.position, o.position);
    }
}
