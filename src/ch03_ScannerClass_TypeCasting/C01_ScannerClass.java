package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // System.out.println("sifreni gir");

       // String sifre = input.nextLine();

       // System.out.println(sifre.replaceAll("\\d", "*"));

       // System.out.println("karenin kenarını gir");
       // int kenar = input.nextInt();
       // int alan= kenar*kenar ;
       // int cevre = kenar*4 ;
       // System.out.println("alan = " + alan);
       // System.out.println("cevre = " + cevre);12

        //task

       //System.out.println("gunluk cay sayini gir");
       //int caysayisi = input.nextInt();

       //System.out.println("caya kac seker atarsın");
       //int sekerSayisi = input.nextInt();

       //System.out.println("yılda ictigin cay sayısı= " + (365*caysayisi) +
       //        "\n Yılda tukettıgı seker mıktarı="+ (caysayisi*sekerSayisi*1.7*365)/1000);

        // task ismin ilk ve son harfini yazdirin

        System.out.println("ismini gir");
        String name = input.nextLine();
        System.out.println("name = " + name);

        char ilkHarf = name.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);

        System.out.println("name.length() = " + name.length());

        char sonHarf = name.charAt(name.length()-1);
        System.out.println("sonHarf = " + sonHarf);



    }
}
