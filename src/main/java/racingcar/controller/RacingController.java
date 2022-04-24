package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.MoveResult;
import racingcar.view.View;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    private final View view;

    public RacingController(View view) {
        this.view = view;
    }

    public void start() {
        String names = view.requestInputCarNames();
        Cars cars = new Cars(names);

        int racingCount = view.requestInputRacingCount();
        view.outputExecutionResultGuide();
        for (int i = 0; i < racingCount; i++) {
            List<Integer> numbers = generateRandomMoveNumber(cars.size());
            MoveResult moveResult = cars.moveForward(numbers);
            view.outputMoveResult(moveResult);
        }

        view.outputVictor(cars.getVictor());
    }

    private List<Integer> generateRandomMoveNumber(int participatedCarCount) {
        List<Integer> numbers = new ArrayList<>();
        do {
            numbers.add(Randoms.pickNumberInRange(Car.MIN_NUMBER, Car.MAX_NUMBER));
        } while (numbers.size() < participatedCarCount);
        return numbers;
    }

}
