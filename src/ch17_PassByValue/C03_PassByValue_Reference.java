package ch17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue_Reference {

    public static void main(String[] args) {


        List<Integer> list =new ArrayList<>(Arrays.asList(24,20,87));

        System.out.println("operasyon oncesi list = " + list);

        listupdate1(list);
        System.out.println("listupdate1 methodu calisti = " );

        listupdate2(list);
        System.out.println("listupdate2 methodu calisti = " );

        System.out.println("operasyon sonrasi list = " + list);
    }

    private static void listupdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);
        }
        System.out.println("update2 icinden" +list);

    }

    private static void listupdate1(List<Integer> list) {
        for (Integer w: list) {
            w+=2;
        }
        System.out.println("list update1 icinden list" +list);
    }
}
