package ch09_Break_Continune;

import java.util.Scanner;

public class C02_continue {

    public static void main(String[] args) {

        /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa,
        ondan sonraki komutlara
        atlar ve loop'un bir sonraki değerinden devam eder.

                */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.

        Scanner input= new Scanner(System.in);
        System.out.println(" email adresinizi girin:");
        String mail=input.nextLine();

        for (int i=0; i< mail.length(); i++) {
            if (mail.charAt(i)==' ') {
                continue;

            }
            System.out.print(mail.charAt(i));
        }





















    }
}
