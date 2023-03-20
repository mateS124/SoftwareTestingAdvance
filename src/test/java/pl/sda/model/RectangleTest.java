package pl.sda.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RectangleTest {

    @ParameterizedTest
    @MethodSource("provideRectangleTestArguments")
    void shouldCalculateAreaOfRectangle(Rectangle rectangle, Integer expectedArea) {
        // given  -  dodalismy argumenty za pomocą adnotacji @MethodSource
        // when
        Integer actualArea = rectangle.getArea();  //wywołujemy  metodę , którą chcemy przetestować
        // then
        Assertions.assertEquals(expectedArea, actualArea);  // testujemy metodę z argumentami podanymi w adnotacji @MethodSource
    }

    static Stream<Arguments> provideRectangleTestArguments() {
        return Stream.of(
                Arguments.of(new Rectangle(), null),
                Arguments.of(new Rectangle(1, 1), 1),
                Arguments.of(new Rectangle(5, 4), 20),
                Arguments.of(new Rectangle(5, 0), 0),
                Arguments.of(new Rectangle(null, 4), null),
                Arguments.of(new Rectangle(4, null), null)
        );
    }
}