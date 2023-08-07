package ch31_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {

        /*
        putIfAbsent() yöntemi, belirtilen bir anahtarın haritada bulunup bulunmadığını kontrol eder.
                Eğer anahtar haritada yoksa, belirtilen değeri anahtarla ilişkilendirir ve haritaya ekler.
        Eğer anahtar zaten haritada varsa, hiçbir işlem yapmadan mevcut değeri döndürür.
                */

        HashMap< String, String> hm = new HashMap<>();

        hm.put("Apple","250 $");
        hm.put("Samsung","200 $");
        hm.put("Huawei","150 $");
        hm.put(null,"125 $");
        hm.put("null",null);
        hm.put("Hp","250 $");
        hm.put("Casper","1000 $");
        hm.put("Casper","101 $");

        System.out.println("hm = " + hm);

        System.out.println("hm.putIfAbsent(\"apple\",\"2500 $\") = " + hm.putIfAbsent("apple", "2500 $"));

        System.out.println("hm.putIfAbsent(\"Huawei\", \"1500 $\") = " + hm.putIfAbsent("Huawei", "1500 $"));

        System.out.println("hm = " + hm);


    }
}
