package racingcar.domain;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private final Set<Car> cars = new LinkedHashSet<>();

    public Cars(String names) {
        for (String name : names.split(",")) {
            cars.add(new Car(name));
        }
    }

    public MoveResult moveForward(List<Integer> numbers) {
        // TODO valid numbers size

        MoveResult moveResult = new MoveResult();

        int i = 0;
        for (Car car : cars) {
            car.moveForward(numbers.get(i++));
            moveResult.add(car.getName(), car.getMoveCount());
        }

        return moveResult;
    }
}
