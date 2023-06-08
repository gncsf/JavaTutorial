package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {

    public static void main(String[] args) {
                /*
         TASK :
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise //nester burada devereye giriyor
        10 dan kucuk olup olmadigini kontrol ediniz.

        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.

        Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int sayi = input.nextInt();

        System.out.println( sayi>=0 ? ( sayi<10 ? "rakam" : "Pozitif Sayi") :"Negatif Sayi"  );

                 /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
         Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
               ödemesi gereken toplam miktarı print eden code create ediniz.
        */

        System.out.println("ürün miktarini giriniz:");
        int urun = input.nextInt();
        System.out.println("urun birim fiyatı gir:");
        int urunFiyat = input.nextInt();
        double fatura = (urun>100 ? (urunFiyat*urun*0.67) : urun*urunFiyat);
        System.out.println("fatura = " + fatura);







    }
}
