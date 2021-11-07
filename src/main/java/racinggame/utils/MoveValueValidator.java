package racinggame.utils;

public class MoveValueValidator {

    private MoveValueValidator() {
    }

    private static final int ADVANCED_CONDITION = 4;

    public static boolean validate(int value) {
        return value >= ADVANCED_CONDITION;
    }
}
