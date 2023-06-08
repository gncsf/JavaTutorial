package ch07_StringManipulations;

import java.util.Scanner;

public class C05_startWith_endWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String city = "Istanbul";

        System.out.println("city.startsWith(\"t\",3) = " + city.startsWith("t", 3));
        System.out.println("city.startsWith(\"t\",2) = " + city.startsWith("t", 2));

        System.out.println("city.endsWith(\"l\") = " + city.endsWith("l"));
        System.out.println("city.endsWith(\"bul\") = " + city.endsWith("bul"));

        // iki string variable kontrol edilmesi

        String str = "asd";
        System.out.println("city.endsWith(str) = " + city.endsWith(str));

        //Task -> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz
        // print edn code creae ediniz.

        //note contains ile yaparsaniz true olur iceren herhangi bir karater girse true olur
        //bunu endsWith() ile yapiniz

        Scanner input = new Scanner(System.in);
        System.out.println("gmailini gir");
        String eMail= input.nextLine();

        String check =eMail.endsWith("@gmail.com") ? "hesabınız onaylandı" : "geçerli hesap giriniz" ;
        System.out.println(check);


    }
}
