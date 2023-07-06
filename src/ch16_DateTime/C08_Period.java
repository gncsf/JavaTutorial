package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate birthday =LocalDate.of(1992,01,02);
        Period fark = Period.between(birthday,bugun);
        System.out.println("fark = " + fark);

        System.out.println("bugun.compareTo(birthday) = " + bugun.compareTo(birthday));

        // task-> 2.5.2023 de (9.ayin 5 i) başlayan kurs 9 ay olduguna göre bitiş tarihini print eden code create ediniz

        LocalDate baslangic = LocalDate.of(2023,5,2);
        System.out.println("baslangic = " + baslangic);

        Period period = Period.ofMonths(9);

        System.out.println("baslangic.plus(period) = " + baslangic.plus(period));






    }
}
