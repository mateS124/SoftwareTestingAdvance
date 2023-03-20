package pl.sda.numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.OptionalInt;



class NumbersTest {
    private final Numbers numbers = new Numbers();

    @Test
    void shouldFindFirstDigitInString() {
        // given

        // when
        OptionalInt possibleInt = numbers.findFirstDigit("ABFG45CDH789");

        // then
        Assertions.assertThat(possibleInt)
                .isNotNull()
                .isPresent()
                .hasValue(4);
    }

    @Test
    void shouldNotFindFirstDigitWhenThereAreNone() {
        // given

        // when
        OptionalInt possibleInt = numbers.findFirstDigit(null);

        // then
        Assertions.assertThat(possibleInt)
                .isNotNull()
                .isEmpty();
    }

    @ParameterizedTest(name = "\"{0}\" does not contain any digit")  // 0 to oznacz 1 argument przed dopisaniem stringu
    @DisplayName("Should not find first digit where there are none...")
    @ValueSource(strings = {"ABC", ""})
    void shouldNotFindFirstDigitWhenThereAreNone(String value) {
        // given

        // when
        OptionalInt possibleInt = numbers.findFirstDigit(value);

        // then
        Assertions.assertThat(possibleInt)
                .isNotNull()
                .isEmpty();
    }

}