package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("tester");
    }

    @Test
    @DisplayName("전진")
    void move() {
        car.moveForward(4);
        assertThat(car.getMoveCount()).isOne();
    }

    @Test
    @DisplayName("멈춤")
    void stop() {
        car.moveForward(3);
        assertThat(car.getMoveCount()).isZero();
    }
}
