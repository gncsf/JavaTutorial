package ch09_Break_Continune;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner input1 = new Scanner(System.in);
        int girisHakki = 3;
        String sifre = "gnc12345";

        while (true) {
            System.out.println(" pin giriniz:");
            String pin = input1.nextLine();
            if (sifre.equals(pin)) {
                System.out.println("sifre eslesti");
                break;
            } else {
                System.out.println("sifre yanlis tekrar dene");
                girisHakki--;
                System.out.println("kalan hakkın = " + girisHakki);
            }

            if (girisHakki == 0) {
                System.out.println("bloke oldun");
                break;
            }


        }
    }
}
