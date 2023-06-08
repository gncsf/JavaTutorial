package ch04_JavaOperators.jo01_ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli bir sayı giriniz:");

        int sayi = input.nextInt();
        int a = sayi % 10;
        sayi /= 10;
        int b = sayi % 10;
        int c = sayi / 10;

        int toplam =a+b+c;

        System.out.println("toplam = " + toplam);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yılı girin: ");
        int yil = scanner.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır.");
                } else {
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(yil + " bir artık yıldır.");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

    }
}
