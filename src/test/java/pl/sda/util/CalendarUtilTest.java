package pl.sda.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class CalendarUtilTest {

    @ParameterizedTest
    @EnumSource(Month.class)
    void shouldReturnTrueForAllMonths(Month month) {
        Assertions.assertTrue(CalendarUtil.monthIsBetweenOneAndTwelve(month));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void shouldReturnTrueFor30DaysLongMonths(Month month) {
        Assertions.assertTrue(CalendarUtil.monthIs30DaysLong(month));
    }


    @ParameterizedTest
    @EnumSource(value = Month.class,
            names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"},
            mode = EnumSource.Mode.EXCLUDE)
    void shouldReturnTrueFor31DaysLongMonths(Month month) {
        Assertions.assertTrue(CalendarUtil.monthIs31DaysLong(month));
    }


    @ParameterizedTest
    @EnumSource(value = Month.class,
            mode = EnumSource.Mode.MATCH_ANY, names = ".*BER")
    void shouldReturnTrueForMonthsEndingWithBer(Month month) {
        Assertions.assertTrue(CalendarUtil.monthNameEndsWithBer(month));
    }
}