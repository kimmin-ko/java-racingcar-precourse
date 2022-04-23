package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars("pobi,woni,jun");
    }

    @Test
    @DisplayName("pobi와 jun 전진")
    void move_pobi_and_jun() {
        String result = "pobi : -" + "\n" +
                "woni : " + "\n" +
                "jun : -" + "\n";

        MoveResult moveResult = cars.moveForward(Arrays.asList(9, 0, 9));
        assertThat(moveResult.toString()).hasToString(result);
    }

    @Test
    @DisplayName("woni와 jun 전진")
    void move_woni_and_jun() {
        String result = "pobi : " + "\n" +
                "woni : -" + "\n" +
                "jun : -" + "\n";


        MoveResult moveResult = cars.moveForward(Arrays.asList(0, 9, 9));
        assertThat(moveResult.toString()).hasToString(result);
    }
}
