package racinggame.service;

import racinggame.utils.CarFactory;
import racinggame.vo.InputValue;
import racinggame.domain.value.RacingResult;

public class SimpleGameExecutor {

    private final InputValue inputValue;

    public SimpleGameExecutor(InputValue inputValue) {
        this.inputValue = inputValue;
    }

    public RacingResult execute() {
        RacingCars racingCars = CarFactory.createRacingCars(inputValue);
        return racingCars.move(inputValue.attempts())
                .getRacingResult();

    }


}
