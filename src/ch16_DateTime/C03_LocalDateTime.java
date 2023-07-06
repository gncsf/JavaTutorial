package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt =LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDate ld = LocalDate.now();

        LocalTime lt = LocalTime.now();

        LocalDateTime ldt1 =LocalDateTime.of(ld,lt);

        System.out.println("ldt1 = " + ldt1);


    }
}
