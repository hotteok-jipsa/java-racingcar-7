package racingcar.view;

import java.util.List;
import racingcar.dto.CarDto;

public class ProgressView {
    private static final String RACE_START_MESSAGE = "실행 결과";
    private static final String COLON = " : ";

    public void printRaceStartMessage() {
        System.out.println(RACE_START_MESSAGE);
    }

    public static void printProgressResult(List<CarDto> carDtos) {
        for (CarDto carDto : carDtos) {
            System.out.print(carDto.name() + COLON);
            printPosition(carDto.position());
        }
        System.out.println();
    }

    private static void printPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
