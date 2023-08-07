package ch29_Iterator;

import java.util.*;

public class C03_ListIterator {
    public static void main(String[] args) {

        System.out.println("******  C03_ListIterator **********");

        List<String > list1 = new ArrayList<>(Arrays.asList("Zeynep ","Ahmet","Eren","Iclal","Safak","Fatih","Ali"));
        System.out.println("list1 in ilk hali  = " + list1);


        //task yukaridaki LIST o ListIterator a atama yaparak SDET eklereyek update kalici ediniz..

        ListIterator<String> iteratorList = list1.listIterator();


        while (iteratorList.hasNext()) {
            int index = iteratorList.nextIndex();
            String eleman = iteratorList.next();


            iteratorList.set(eleman + " SDET");
        }


        System.out.println(" duzenleme sonrasi list1 = " + list1);

        //task yeni list create ediniz
        //list1 i iterator a atayini
        //list2 yi add methodu ile list1 e ekleyin
        //herbir elemani prin ediniz

        List<String> list2 = new ArrayList<>(Arrays.asList("mehmet", "ufuk"));


        Iterator<String> iterator = list1.iterator();

        // Add each element of list1 to list2 using the add method
        while (iterator.hasNext()) {
            String str = iterator.next();
            list2.add(str);
        }


        System.out.print("list2 elemanları: ");
        for (String str : list2) {
            System.out.println(str);
        }



















    }
}
