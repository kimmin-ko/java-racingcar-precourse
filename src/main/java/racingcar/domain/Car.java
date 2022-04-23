package racingcar.domain;

public class Car {
    private static final String INVALID_MOVE_NO_ERROR_MESSAGE = "[ERROR] 자동자 랜덤 값은 0 ~ 9 사이의 숫자여야 한다.";
    private static final int MIN_MOVABLE = 4;

    private final String name;
    private int moveCount;

    public Car(String name) {
        this.name = name;
    }

    public void moveForward(int no) {
        if (no < 0 || no > 9) {
            throw new IllegalArgumentException(INVALID_MOVE_NO_ERROR_MESSAGE);
        }

        if (isMovable(no)) {
            this.moveCount++;
        }
    }

    public int getMoveCount() {
        return moveCount;
    }

    private boolean isMovable(int no) {
        return no >= MIN_MOVABLE;
    }
}
