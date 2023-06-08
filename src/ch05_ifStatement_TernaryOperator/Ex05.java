package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        //TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

        Scanner input= new Scanner(System.in);
        System.out.println("birinci sayiyi giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz:");
        int sayi2 = input.nextInt();

        int toplam = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpma = sayi1 * sayi2;
        int bolme = sayi1 / sayi2;

        System.out.println("hangiislem sonucunu görmek istersin toplama icin  1 e " +
                " \n cikarma için 2 ye" + "\n carpma icin 3 e" + "\n bolme icin 4 e bas");

        int secim = input.nextInt();

        if (secim==1) {
            System.out.println("toplam = " + toplam);
        }else if (secim==2) {
            System.out.println("cikarma = " + cikarma);
        }else if (secim==3){
            System.out.println("carpma = " + carpma);
        }else if (secim==4){
            System.out.println("bolme = " + bolme);
        }else {
            System.out.println("yanlis tuslama");

        }
    }
}
