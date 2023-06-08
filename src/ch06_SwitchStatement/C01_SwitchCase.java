package ch06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("rakam gir");
        int rakam = input.nextInt();


        if (rakam == 0) {
            System.out.println("sifir");
        }else if (rakam==1) {
            System.out.println("bir");
        }else if (rakam==2) {
            System.out.println("iki");
        }else {
            System.out.println("0 ile 2 arasında bir rakam girmelisin");
        }

        // switch

        switch (rakam) {
            case 0:
                System.out.println("sifir");
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            default :
                System.out.println("0 ile 2 arasında bir rakam girmelisin");
        }

        // switch örnegi

        System.out.println(" ana menu icin A \nurun gostermek ıcın B eklemek icin C\n cikis icin Q ya basiniz");
        String islem = input.next().toUpperCase();

        switch (islem) {
            case "A":
                System.out.println("ana menuye hosgeldin");
                break;
            case "B":
                System.out.println("hangi urunleri gormek istersin");
                break;
            case "C":
                System.out.println("hangi urunleri eklemek istersin");
                break;
            case "Q":
                System.out.println("cikis isleminiz yapiliyor");
                break;

        }






















    }



}
