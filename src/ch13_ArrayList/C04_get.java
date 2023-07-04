package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {

    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "İzmir", "konya", "erzurum"));
        System.out.println("city = " + city);

        System.out.println("city.get(1) = " + city.get(1));


        //System.out.println("city.get(20) = " + city.get(20));











    }
}
