package racingcar.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static racingcar.ExceptionMessage.TRIAL_INVALID_EXCEPTION;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RaceTest {

    @ParameterizedTest
    @ValueSource(strings = {"5", "45", "1"})
    void 시도할_횟수를_등록한다(String trial) {
        assertThatCode(() -> new Race(trial)).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"5번", "0", "-45"})
    void 시도할_횟수가_자연수가_아니라면_예외를_발생시킨다(String trial) {
        assertThatThrownBy(() -> new Race(trial))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(TRIAL_INVALID_EXCEPTION.message);
    }
}
