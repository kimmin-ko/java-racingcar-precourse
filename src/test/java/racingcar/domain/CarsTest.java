package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    @DisplayName("woni와 jun 전진")
    void move_woni_and_jun() {
        String result = "pobi : " + "\n" +
                "woni : -" + "\n" +
                "jun : -";

        Cars cars = new Cars("pobi,woni,jun");
        MoveResult moveResult = cars.moveForward(Arrays.asList(3, 4, 5));
        assertThat(moveResult.toString()).hasToString(result);
    }
}
