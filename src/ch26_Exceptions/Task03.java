package ch26_Exceptions;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        //int v = vize
        //int f = final

        //Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        //Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.

        //Diğer durumlarda ise,
        //vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)

        //Programın çalışmasını sağlayın. (handle edin)

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("vize notunu girin: ");
                int vize = input.nextInt();

                System.out.print("final notunu girin: ");
                int finalNot = input.nextInt();

                int ortalama = ortalama(vize, finalNot);
                System.out.println("Ortalama: " + ortalama);
                break;

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException e.getMessage() = " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception e.getMessage() = " + e.getMessage());
            }
        }
    }

    public static int ortalama(int v, int f) {
        if (v > 100 || f > 100 || v < 0 || f < 0) {
            throw new ArithmeticException("Notlar 0-100 arasında olmalı.");

        } else {
            return (int) (v * 0.4 + f * 0.6);

        }



















    }
}
