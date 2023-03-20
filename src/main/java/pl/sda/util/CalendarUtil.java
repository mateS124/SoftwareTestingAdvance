package pl.sda.util;

import java.time.Month;
import java.util.EnumSet;
import java.util.Set;

class CalendarUtil {

    private static final Set<Month> MONTHS_WITH_30_DAYS = EnumSet.of(Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER);
    private static final Set<Month> MONTH_WITH_31_DAYS = EnumSet.of(Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER);

    static boolean monthIsBetweenOneAndTwelve(Month month) {
        return month != null && month.getValue() >= 1 && month.getValue() <= 12;
    }

    static boolean monthIs30DaysLong(Month month) {
        return month != null
                && MONTHS_WITH_30_DAYS.contains(month);
    }

    static boolean monthIs31DaysLong(Month month) {
        return month != null
                && MONTH_WITH_31_DAYS.contains(month);
    }

    static boolean monthNameEndsWithBer(Month month) {
        return month != null
                && month.name().toLowerCase().endsWith("ber");
    }
}