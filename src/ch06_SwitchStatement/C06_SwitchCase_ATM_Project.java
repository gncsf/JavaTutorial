package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase_ATM_Project {
    static String password = "12345";

    public static void main(String[] args) {
                /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
         çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("****** Java BAnk ATM sine Hosgeldiniz **************** ");

        System.out.println("sifreni gir");
        String sifre = input.nextLine();

        if (sifre.equals(password)) {
            System.out.println(" sifresniz eslesti devam edebilirsiniz");

            System.out.println(" bakiye sorgulama için 1 \npara yatirma icin 2 \n" +
                    "para cekme icin 3 \ncikis icin 4 tusuna basiniz");

            int secim =input.nextInt();

            int bakiye = 1000;
             switch (secim) {

                case 1 :
                    System.out.println("bakiye = " + bakiye);
                    break;
                 case 2 :
                     System.out.println("ne kadar yatirmak istersin");
                    int yatrilanMiktar = input.nextInt();
                    bakiye += yatrilanMiktar;
                     System.out.println(" guncel bakiyeniz= " + bakiye);
                     break;
                 case 3 :
                     System.out.println("ne kadar cekmek istersiniz");
                     int cekilecekMiktar = input.nextInt();
                     if (cekilecekMiktar<= bakiye) {
                         bakiye -= cekilecekMiktar;
                         System.out.println("cekilecekMiktar = " + cekilecekMiktar);
                         System.out.println("kalan bakiyeniz = " + bakiye);
                     }else System.out.println("bakiye yetersiz = " + bakiye);
                     break;

                 case 4 :
                     System.out.println("cikis yapiyorsunuz yine bekleriz");
                    break;

                     default :
                         System.out.println("hatali sifre girdiniz");


             }



        }else {
            System.out.println("hatalı sifre iki hakkınız kaldi");
        }




    }
}
