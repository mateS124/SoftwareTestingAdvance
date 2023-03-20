package pl.sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LineTest {
    @Test
    void shouldValidatteLines(){
        //given
        String value1 = "r.*" ; // "raz" / wyrażenie regularne musi być po stronie oczekiwań
        String value2 = "raz";//  listy muszą mieć taki sam roamiar lista2 = List.of(value2, value3) będzie błędem

        List<String> list1 = new ArrayList<>();
        list1.add(value1);

        List<String> list2 = List.of(value2);

        //when
        //then
        Assertions.assertLinesMatch(list1, list2);
    }
}
