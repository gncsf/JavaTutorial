package ch31_Map;

import java.util.HashMap;

public class C03_get {

    /*
    get() yöntemi, bir harita içinde belirtilen anahtarın karşılık gelen değerini elde etmek için kullanılır.
    Eğer verilen anahtar haritada bulunmazsa, null değeri döndürür.

            */
    public static void main(String[] args) {



        HashMap< String, String> hm = new HashMap<>();

        hm.put("Apple","250 $");
        hm.put("Samsung","200 $");
        hm.put("Huawei","150 $");
        hm.put(null,"125 $");
        hm.put(null,null);
        hm.put("Hp","250 $");
        hm.put("Casper","1000 $");
        hm.put("Casper","101 $");

        System.out.println("hm = " + hm);

        // task get methodu ile istedignz bir elemani (value) print ediniz

        System.out.println("hm.get(null) = " + hm.get(null));
        System.out.println("hm.get(\"Apple\") = " + hm.get("Apple"));
        System.out.println("hm.get(\"Casper\") = " + hm.get("Casper"));
        System.out.println("hm.get(\"Casper\") = " + hm.get("Casper"));
        System.out.println("hm.get(\"Xiaomi\") = " + hm.get("Xiaomi"));
        System.out.println("hm.get(12) = " + hm.get(12));




    }
}
