package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_LİstConvertToArray {

    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "İzmir", "konya", "erzurum","samsun"));
        System.out.println("city = " + city);

        Object [] arrCity=  city.toArray();

        System.out.println("Arrays.toString(arrCity) = " + Arrays.toString(arrCity));

        String [] arrCity2= city.toArray(new String [0]);

        System.out.println("Arrays.toString(arrCity2) = " + Arrays.toString(arrCity2));


    }
}
