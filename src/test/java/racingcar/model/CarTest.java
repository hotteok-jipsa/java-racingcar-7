package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.ExceptionMessage.CAR_NAME_INVALID_EXCEPTION;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "jun"})
    void 자동차를_등록한다(String carName) {
        assertThatCode(() -> new Car(carName)).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"pobidobi", "junnne"})
    void 자동차_이름이_5자를_초과한다면_예외를_발생시킨다(String carName) {
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(CAR_NAME_INVALID_EXCEPTION.message);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  "})
    void 자동차_이름이_공백이라면_예외를_발생시킨다(String carName) {
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(CAR_NAME_INVALID_EXCEPTION.message);
    }

}
