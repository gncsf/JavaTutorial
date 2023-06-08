package ch07_StringManipulations;

public class C11_valueOf_parseInt {

    public static void main(String[] args) {

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String bagis = "100";
        String bagis1 = "200";

        int sonuc = Integer.valueOf(bagis) + Integer.valueOf(bagis1);
        System.out.println("sonuc = " + sonuc);

        int b1 = Integer.parseInt(bagis);
        System.out.println("b1 = " + b1);
        int b2 = Integer.parseInt(bagis1);
        System.out.println("b2 = " + b2);


    }
}
