package ch17_PassByValue;

import java.sql.SQLOutput;

public class C04_PassByValue_Reference {

    static double etiketFiyat ;
    static double indirimOrani ;

    public static void main(String[] args) {

        etiketFiyat=100;

        System.out.println("method call oncesi etiket fiyati " +etiketFiyat);

        indirimOrani=0.1;

        indir();
        indir();
        indir();


        System.out.println("method call sonrasi etiket fiyati " +etiketFiyat);




    }

    private static void indir() {
        etiketFiyat*=(1-indirimOrani);
        System.out.println("etiket fiyatı method içinden "+ etiketFiyat);


    }
}
