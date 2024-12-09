package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.ProgressView;

public class CarRaceController {

    private final InputView inputView;
    private final ProgressView progressView;
    private final OutputView outputView;

    public CarRaceController(InputView inputView, ProgressView progressView, OutputView outputView) {
        this.inputView = inputView;
        this.progressView = progressView;
        this.outputView = outputView;
    }

    public void start() {
        Cars cars = getCars(getCarNames());
        Race race = new Race(getTrialCount());
        startRace(race, cars);
        finishRace(cars);
    }

    private String[] getCarNames() {
        inputView.printCarNameInputGuideMessage();
        return inputView.getCarNames();
    }

    private Cars getCars(String[] carNames) {
        Cars cars = new Cars();
        for (String name : carNames) {
            cars.registerCar(new Car(name));
        }
        return cars;
    }

    private String getTrialCount() {
        inputView.printTrialInputGuideMessage();
        return inputView.getTrialCount();
    }

    private void startRace(Race race, Cars cars) {
        progressView.printRaceStartMessage();
        race.start(cars);
    }

    private void finishRace(Cars cars) {
        outputView.printResultMessage(cars.getFarthestCars());
    }
}
