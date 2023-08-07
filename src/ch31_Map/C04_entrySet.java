package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {

    /*
    entrySet() yöntemi, bir Map nesnesinin içindeki tüm girişleri (anahtar-değer çiftlerini) içeren
    bir Set koleksiyonunu döndürür. Her giriş, Map.Entry arabirimi tarafından temsil edilir ve
    bu arabirim, getKey() ve getValue() yöntemleri aracılığıyla anahtar ve değerlere erişim sağlar.
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

        System.out.println("hm.entrySet() = " + hm.entrySet());

        //task foreach ile entrySet methodu kullanip map elemanlarini print edin

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}
