package ch29_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        System.out.println("********* Iterator *********");


        List<String > list1 = new ArrayList<>(Arrays.asList("Zeynep ","Ahmet","Eren","Iclal","Safak","Fatih","Ali"));


        System.out.println("list1 in ilk hali  = " + list1);

        //task list deki elemanlari silip print ediniz Iterator ile


        Iterator<String> iterator = list1.iterator();


        while (iterator.hasNext()) {
            String eleman = iterator.next();
            iterator.remove();
        }


        System.out.println(" silme işlemi sonrası list1 = " + list1);

















    }
}
