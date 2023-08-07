package ch31_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {


        /*
        TreeMap->
                1-TreeMap key'lrde null değer tanımlanamaz. Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
 */

        TreeMap <Integer,String> tm = new TreeMap<Integer,String>();

        tm.put(1000,"omer");
        tm.put(1001,"emine");
        tm.put(1002,"eren");
        tm.put(1003,"derya");

        System.out.println("tm = " + tm);

        //System.out.println("tm.put(null, \"run time\") = " + tm.put(null, "run time"));

        HashMap< String, String> hm = new HashMap<>();

        hm.put("Apple","250 $");
        hm.put("Samsung","200 $");
        hm.put("Huawei","150 $");
       // hm.put(null,"125 $");
        //hm.put("null",null);
        hm.put("Hp","250 $");
        hm.put("Casper","1000 $");
        hm.put("Casper","101 $");

        System.out.println("hm = " + hm);

        TreeMap <String,String> tm1 = new TreeMap<>(hm);
        System.out.println("tm1 = " + tm1);

        /**
 * Bu metot, belirtilen bir anahtarın veya anahtarın üstündeki en küçük anahtarı döndürür.
                * Yani, verilen bir anahtardan büyük veya eşit olan ilk anahtarı bulur.
                * Bu yöntem, sıralı bir haritada (örneğin, TreeMap) oldukça kullanışlıdır.
 */


        System.out.println("tm.ceilingKey(999) = " + tm.ceilingKey(999));

        System.out.println("tm.ceilingKey(2000) = " + tm.ceilingKey(2000));

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());

        System.out.println("tm.keySet() = " + tm.keySet());
        System.out.println("tm.firstKey() = " + tm.firstKey());

        System.out.println("tm.lastKey() = " + tm.lastKey());


    }
}
