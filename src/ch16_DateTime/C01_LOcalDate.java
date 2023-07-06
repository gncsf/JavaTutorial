package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class C01_LOcalDate {
    public static void main(String[] args) {


        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());

        LocalDateTime saat =  LocalDateTime.now();
        System.out.println("saat = " + saat);

        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getEra() = " + bugun.getEra());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());

        LocalDate date1 = LocalDate.of(1990, 8,23);
        LocalDate date2 = LocalDate.of(1996, 8,23);
        LocalDate date3 = LocalDate.of(1990, Month.AUGUST,23);





    }
}
