package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("tester");
    }

    @Test
    @DisplayName("이동 실패")
    void move_failed() {
        String errorMessage = "[ERROR] 자동자 랜덤 값은 0 ~ 9 사이의 숫자여야 한다.";

        assertThatThrownBy(() -> car.moveForward(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(errorMessage);

        assertThatThrownBy(() -> car.moveForward(10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(errorMessage);
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
