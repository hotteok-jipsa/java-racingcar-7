package racingcar.model;

import static racingcar.ExceptionMessage.TRIAL_INVALID_EXCEPTION;

public class Race {
    private final int trial;

    public Race(String rawTrial) {
        validateTrialCount(rawTrial);
        this.trial = Integer.parseInt(rawTrial);
    }

    private void validateTrialCount(String trial) {
        if (!trial.matches(("[1-9]\\d*"))) {
            throw new IllegalArgumentException(TRIAL_INVALID_EXCEPTION.message);
        }
    }
}
