package racinggame.utils;

import racinggame.InputValue;
import racinggame.exception.NotInstanceException;

public class InputUtils {

    private InputUtils() {
        throw new NotInstanceException();
    }

    public static InputValue convertInputValue(String numberOfCars, String numberOfAttempts) {
        validate(numberOfCars, numberOfAttempts);
        return InputValue.create(convertInt(numberOfCars), convertInt(numberOfAttempts));
    }

    private static int convertInt(String value) {
        return Integer.parseInt(value);
    }

    private static void validate(String numberOfCars, String numberOfAttempts) {
        InputValidator.validate(numberOfCars);
        InputValidator.validate(numberOfAttempts);
    }

}
