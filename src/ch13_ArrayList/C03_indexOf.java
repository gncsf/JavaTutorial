package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexOf {

    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "İzmir", "konya", "erzurum"));
        System.out.println("city = " + city);
        ArrayList<String> country = new ArrayList<>(List.of("Madagascar", "Almanya", "Alaska", "Polonya", "Argentina"));
        System.out.println("country = " + country);

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun"));

        System.out.println("city.indexOf(\"Ankara\") = " + city.indexOf("Ankara"));

        country.add("İngiltere");
        System.out.println("country.indexOf(\"İngiltere\") = " + country.indexOf("İngiltere"));
        System.out.println("country.lastIndexOf(\"İngiltere\") = " + country.lastIndexOf("İngiltere"));

        country.add("Almanya");

        country.indexOf("Almanya");
        country.lastIndexOf("Almanya");

        System.out.println("country = " + country);




    }
}
