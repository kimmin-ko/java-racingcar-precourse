package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private final Set<Car> cars = new HashSet<>();

    public Cars(String names) {
        for (String name : names.split(",")) {
            cars.add(new Car(name));
        }
    }

    public MoveResult moveForward(List<Integer> carNames) {
        return new MoveResult();
    }
}
