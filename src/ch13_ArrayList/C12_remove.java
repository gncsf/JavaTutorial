package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {

    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("Madagascar", "Almanya", "Alaska", "Polonya", "Argentina"));
        System.out.println("country = " + country);

        Collections.sort(country);

        System.out.println("country.remove(\"almanya\") = " + country.remove("almanya"));

        System.out.println("country.remove(\"Almanya\") = " + country.remove("Almanya"));

        country.remove(0);

        System.out.println("country = " + country);

        country.add("America");
        country.add("Netherlands");
        country.add("Ukrain");
        country.add("Amerika");

        System.out.println("country = " + country);

        System.out.println("country.remove(\"America\") = " + country.remove("America"));

        System.out.println("country = " + country);

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "İzmir", "konya", "erzurum"));
        System.out.println("city = " + city);

        country.addAll(city);

        System.out.println("country = " + country);

        country.removeAll(city);

        System.out.println("country = " + country);


    }
}
