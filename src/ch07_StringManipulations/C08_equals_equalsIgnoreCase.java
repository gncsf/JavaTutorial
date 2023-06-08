package ch07_StringManipulations;

public class C08_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        /** equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */

        String str1 = "Merhaba";
        String str2 = "merhaba";

        System.out.println("str1 replace öncesi =" + str1);
        System.out.println("str1.replace(\"\\\\w\" , \"*\") = " + str1.replaceAll("\\w", "*"));

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));

        System.out.println(str1.equalsIgnoreCase(str2));

        str2= "Merhaba";

        System.out.println(str1.equals(str2));

        System.out.println("       ");

        String s1 = "ahmet";
        String s2 = "ahmet";

        String s3 = new String("zeynep");
        String s4 = new String("zeynep");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


    }
}
