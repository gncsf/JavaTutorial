package ch31_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {

        /*
        remove() yöntemi, belirtilen bir anahtara karşılık gelen değeri ve anahtarı kendisini haritadan kaldırmak için kullanılır.
        Eğer belirtilen anahtar haritada bulunmazsa, herhangi bir değişiklik yapılmaz ve bu yöntem null değeri döndürür.
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

        System.out.println("hm.remove(\"Samsung\", \"200 $\") = " + hm.remove("Samsung", "200 $"));

        System.out.println("hm.remove(null) = " + hm.remove(null));

        System.out.println("hm = " + hm);

        System.out.println("hm.remove(\"isatanbul\") = " + hm.remove("isatanbul"));


    }
}
