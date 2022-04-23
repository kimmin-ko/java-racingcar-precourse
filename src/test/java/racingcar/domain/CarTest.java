package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("멈춤")
    void stop() {
        Car car = new Car("tester");
        car.moveForward(3);
        assertThat(car.getMoveCount()).isZero();
    }
}
