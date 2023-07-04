package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {

    public static void main(String[] args) {


        ArrayList<String> country = new ArrayList<>(List.of("Madagascar", "Almanya", "Alaska", "Polonya", "Argentina"));
        System.out.println("country = " + country);

        System.out.println("country.contains(\"Almanya\") = " + country.contains("Almanya"));




    }
}
