package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.dto.CarDto;

public class OutputView {
    private static final String RESULT_MESSAGE_PREFIX = "최종 우승자 : ";

    public void printResultMessage(List<CarDto> winners) {
        System.out.println(RESULT_MESSAGE_PREFIX + getWinnersName(winners));
    }

    private String getWinnersName(List<CarDto> winners) {
        List<String> winnersName = winners.stream().map(CarDto::name).collect(Collectors.toList());
        return String.join(",", winnersName);
    }
}
