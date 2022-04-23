package racingcar.domain;

import java.util.Objects;

public class Car {
    private static final String INVALID_NO_ERROR_MESSAGE = "[ERROR] 자동자 랜덤 값은 0 ~ 9 사이의 숫자여야 한다.";
    private static final int MIN_MOVABLE = 4;
    private static final int MIN_NO = 0;
    private static final int MAX_NO = 9;

    private final CarName name;
    private int moveCount;

    public Car(String name) {
        this.name = new CarName(name);
    }

    public void moveForward(int no) {
        if (isInvalidNo(no)) {
            throw new IllegalArgumentException(INVALID_NO_ERROR_MESSAGE);
        }

        if (isMovable(no)) {
            this.moveCount++;
        }
    }

    public int getMoveCount() {
        return moveCount;
    }

    private boolean isInvalidNo(int no) {
        return no < MIN_NO || no > MAX_NO;
    }

    private boolean isMovable(int no) {
        return no >= MIN_MOVABLE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
