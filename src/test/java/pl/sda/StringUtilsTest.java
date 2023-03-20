package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void teatSameAssertion() {
        //given
        String name = "Bartosz";
        String anotherName = new String("Bartosz");
        //when

        //then

        Assertions.assertEquals(name, anotherName);
        Assertions.assertSame(name, anotherName);
    }
}
