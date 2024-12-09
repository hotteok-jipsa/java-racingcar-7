package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String CAR_NAME_INPUT_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRIAL_INPUT_GUIDE_MESSAGE = "\n시도할 횟수는 몇 회인가요?";

    public void printCarNameInputGuideMessage() {
        System.out.println(CAR_NAME_INPUT_GUIDE_MESSAGE);
    }

    public void printTrialInputGuideMessage() {
        System.out.println(TRIAL_INPUT_GUIDE_MESSAGE);
    }

    public String[] getCarNames() {
        String carNames = Console.readLine();
        return carNames.split(",");
    }

    public String getTrialCount() {
        return Console.readLine();
    }
}
