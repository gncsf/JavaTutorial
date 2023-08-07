package ch31_Map;

import java.util.HashMap;

public class C09_gerOrDefault {
    public static void main(String[] args) {

       /*
        getOrDefault() yöntemi, belirtilen bir anahtarın değerini alırken, eğer anahtar haritada
        bulunmuyorsa varsayılan bir değer döndürmek için kullanılır.
                Eğer anahtar haritada varsa, o anahtarın mevcut değerini döndürür.
 */

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


        System.out.println("hm.getOrDefault(\"Hp\",\"5000 $\") = " +
                hm.getOrDefault("Hp", "5000 $"));

        System.out.println("hm.getOrDefault(\"hp\",\"500 000 $\") = " +
                hm.getOrDefault("hp", "500 000 $"));



    }
}

