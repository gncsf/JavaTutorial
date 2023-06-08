package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ay sayısını giriniz");
        int aySayi = scan.nextInt();

        switch (aySayi) {
            case 12:

            case 1:

            case 2:
                System.out.println("kış mevsimi");
                break;

            case 3:

            case 4:

            case 5:


                System.out.println("ilkbahar");
                break;
            case 6:

            case 7:

            case 8:

                System.out.println("yaz");
                break;
            case 9:

            case 10:

            case 11:

                System.out.println("sonbahar");
                break;
            default:
                System.out.println(" 1 ile 12 arasi bir sayi giriniz");


        }
    }
}
