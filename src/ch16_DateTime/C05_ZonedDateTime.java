package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class C05_ZonedDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihZone = LocalDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("tarihZone = " + tarihZone);


    }
}
