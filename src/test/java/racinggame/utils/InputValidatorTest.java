package racinggame.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.exception.EmptyAndNullSourceException;
import racinggame.exception.InvalidInputException;
import racinggame.exception.ZeroStringException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidatorTest {

    @DisplayName("입력된 값이 null혹은, 빈값일 경우 예외발생")
    @ParameterizedTest
    @NullAndEmptySource
    void validateNullAndEmpty(String input) {
        assertThatThrownBy(() -> InputValidator.validate(input))
                .isInstanceOf(EmptyAndNullSourceException.class)
                .hasMessage(InputValidator.INVALID_SOURCE_MESSAGE);
    }

    @DisplayName("입력값이 0일 경우 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = "0")
    void validateZero(String input) {
        assertThatThrownBy(() -> InputValidator.validate(input))
                .isInstanceOf(ZeroStringException.class)
                .hasMessage(InputValidator.ZERO_INPUT_MESSAGE);
    }

    @DisplayName("입력값이 일반 문자열일 경우")
    @ParameterizedTest
    @ValueSource(strings = {"문자열1", "입력값입니다.", "잘못 입력했어요.", "숫자가 아닙니다."})
    void validateString(String input) {
        assertThatThrownBy(() -> InputValidator.validate(input))
                .isInstanceOf(InvalidInputException.class)
                .hasMessage(InputValidator.INVALID_INPUT_MESSAGE);
    }
}