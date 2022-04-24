package racingcar.view;

import racingcar.domain.MoveResult;
import racingcar.domain.Victor;

public interface View {
    String requestInputCarNames();

    int requestInputRacingCount();

    void outputMoveResult(MoveResult moveResult);

    void outputVictor(Victor victor);

    void errorMessage(Exception e);

    void outputExecutionResultGuide();
}
