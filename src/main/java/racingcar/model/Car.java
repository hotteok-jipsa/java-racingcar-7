package racingcar.model;

import static racingcar.ExceptionMessage.CAR_NAME_INVALID_EXCEPTION;

public class Car {

    private final String name;

    public Car(String name) {
        validateCarName(name);
        this.name = name;
    }

    private void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_INVALID_EXCEPTION.message);
        }
    }

}
