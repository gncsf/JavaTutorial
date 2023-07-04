package ch13_ArrayList;

import java.util.*;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("Madagascar", "Almanya", "Alaska", "Polonya", "Argentina"));



        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "İzmir", "konya", "erzurum"));

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"New Zealand"));

        System.out.println("yeniList = " + yeniList);

        // addAll methodu ile iki

        //city.addAll(country);
        //System.out.println("city = " + city);

        // belirlenen index e ekleme

        city.addAll(1,country);
        System.out.println("city = " + city);




    }
}
