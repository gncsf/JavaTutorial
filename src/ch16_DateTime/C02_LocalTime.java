package ch16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        // saat dakika saniye milisaniye

        LocalTime suan =LocalTime.now();

        System.out.println("suan = " + suan);

        System.out.println("suan.getHour() = " + suan.getHour());

        LocalTime suan2 =LocalTime.of(13,55,50);
        System.out.println("suan2 = " + suan2);

        System.out.println("suan2.plusNanos(1234568551) = " + suan2.plusNanos(1234568551));

        LocalTime forLoopsBasi =LocalTime.now();
        System.out.println("forLoopsBasi.getNano() = " + forLoopsBasi.getNano());

        int toplam =0;
        for (int i = 0; i <1000000; i++) {

            toplam+=i;
        }

        System.out.println("toplam = " + toplam);
        LocalTime forLoopsonu =LocalTime.now();
        System.out.println("forLoopsonu.getNano() = " + forLoopsonu.getNano());

        System.out.println("fark nano = " + (forLoopsonu.getNano() - forLoopsBasi.getNano()));


    }
}
