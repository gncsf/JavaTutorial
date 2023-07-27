package ch26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

       // LocalDate date = LocalDate.of(2023,4,33);
       // System.out.println("date = " + date);


        try {
            LocalDate date = LocalDate.of(2023,4,33);
            System.out.println("try sorunsuz calisti");
        } catch (DateTimeException e) {
            System.out.println("catch block yakaladi exception i . ay sayisi fazla girdin");
            System.out.println(e.getMessage());

        }
        System.out.println("sorun cozouldu devam et-");

    }
}
