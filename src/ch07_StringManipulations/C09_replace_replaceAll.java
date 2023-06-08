package ch07_StringManipulations;

import java.util.Scanner;

public class C09_replace_replaceAll {

    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

        String str = "ezberlemek beyne ihanettir 12356 ^#^%$ () :";

        System.out.println("str.replace('a', '$') = " + str.replace('a', '$'));

        System.out.println("str.replace(\"tir\", \"dir\") = " + str.replace("tir", "dir"));
        System.out.println("str.replaceFirst(\"e\", \"*\") = " + str.replaceFirst("e", "*"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)


        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        //   "\\w" tum harf ve rakamlar [A-Z a-z 0-9]

        System.out.println("str.replaceAll(\"\\\\w\", \"*\") = " + str.replaceAll("\\w", "*"));
        System.out.println("str.replaceAll(\"\\\\W\", \"*\") = " + str.replaceAll("\\W", "*"));

        System.out.println("str.replaceAll(\"[A-Za-z]\" , \"*\") = " + str.replaceAll("[A-Za-z]", "*"));

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
        // formatta print eden code create ediniz.

        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:");
        String name = input.nextLine();
        System.out.println("lütfen soy isminizi giriniz:");
        String surName = input.nextLine();
        System.out.println("lütfen kart numaranızı giriniz:");
        String cardNumber = input.nextLine();

        String yeniIsimCıktı = name.charAt(0) + name.substring(1).replaceAll("\\w", "*");

        System.out.println("yeniIsimCıktı = " + yeniIsimCıktı);

        String yeniSoyIsimCıktı = surName.charAt(0) + surName.substring(1).replaceAll("\\w", "*");
        System.out.println("yeniSoyIsimCıktı = " + yeniSoyIsimCıktı);

        String cardNumberYeni = "************" +  cardNumber.substring(12);

        System.out.println("cardNumberYeni = " + cardNumberYeni);


    }
}
