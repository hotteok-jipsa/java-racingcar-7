package racingcar;

public enum ExceptionMessage {
    CAR_NAME_INVALID_EXCEPTION("자동차 이름은 5자 이하이고 공백이 아니어야 합니다.");


    private final String prefix = "[ERROR] ";
    public final String message;


    ExceptionMessage(String message) {
        this.message = prefix + message;
    }
}
