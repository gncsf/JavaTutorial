package ch09_Break_Continune;

import java.util.Scanner;

public class C03_AsalKontol {
    public static void main(String[] args) {

        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayi yazin");
        int sayi = input.nextInt();
        boolean asalMi = true;


        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                System.out.println(sayi + "sayı asal degil");
                asalMi = false;
                break;
            } else if (sayi % i == 1) {

            }
        }

        if (asalMi && sayi != 1) {
            System.out.println(sayi + " sayisi asal sayidir");
        } else System.out.println("asal degil");


    }
}




















