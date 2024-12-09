package racingcar.model;

import static racingcar.ExceptionMessage.TRIAL_INVALID_EXCEPTION;

import racingcar.view.ProgressView;

public class Race {
    private final int trial;

    public Race(String rawTrial) {
        validateTrialCount(rawTrial);
        this.trial = Integer.parseInt(rawTrial);
    }

    public void start(Cars cars) {
        for (int round = 1; round <= trial; round++) {
            cars.moveCars();
            ProgressView.printProgressResult(cars.getCarDtos());
        }
    }

    private void validateTrialCount(String trial) {
        if (!trial.matches(("[1-9]\\d*"))) {
            throw new IllegalArgumentException(TRIAL_INVALID_EXCEPTION.message);
        }
    }
}
