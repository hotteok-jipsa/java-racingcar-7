package racingcar;

import racingcar.controller.CarRaceController;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.ProgressView;

public class CarRaceApplication {
    public static void run() {
        InputView inputView = new InputView();
        ProgressView progressView = new ProgressView();
        OutputView outputView = new OutputView();

        new CarRaceController(inputView, progressView, outputView).start();
    }
}
