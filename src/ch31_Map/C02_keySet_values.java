package ch31_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {


        /*
        keySet() yöntemi, harita içindeki tüm anahtarları içeren bir Set koleksiyonunu döndürür.
        Harita içindeki anahtarlar benzersizdir ve bu yöntem sayesinde onlara koleksiyon benzeri bir şekilde erişebiliriz.

        values() yöntemi de Map arabirimine aittir. Bu yöntem, harita içindeki tüm değerleri içeren bir Collection
        (genellikle ArrayList) koleksiyonunu döndürür. Harita içindeki değerler yinelenen olabilir
        ve bu yöntem sayesinde onlara koleksiyon benzeri bir şekilde erişebiliriz.
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

        //task = map in key ve value larini print ediniz


        System.out.println("hm.keySet() = " + hm.keySet());

        System.out.println("hm.values() = " + hm.values());

        System.out.println("**************");

        for (String key : hm.keySet()) {
            System.out.println(key);

        }

        for (String value : hm.values()){

            System.out.println(value);

        }

        System.out.println("*******");
        for (String w: hm.keySet()){
            System.out.println(w+" = "+hm.get(w));
        }














    }
}
