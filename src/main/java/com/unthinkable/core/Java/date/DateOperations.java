package com.unthinkable.core.Java.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateOperations {
    public static void operations() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = LocalDate.of(1997, Month.DECEMBER, 19);
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(LocalTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(LocalTime.now(ZoneId.of("America/Cuiaba")));
    }
}
