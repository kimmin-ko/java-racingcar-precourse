package racingcar.domain;

public class Car {
    private static final int MIN_MOVABLE = 4;

    private final String name;
    private int moveCount;

    public Car(String name) {
        this.name = name;
    }

    public void moveForward(int no) {
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
