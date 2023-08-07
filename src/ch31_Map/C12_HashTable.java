package ch31_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {

        Hashtable <String, String> ht = new Hashtable<String, String>();

        ht.put("Zeynep", "123456789");
        ht.put("Ali", "12354485");
        ht.put("Kemal", "12241566419");
        ht.put("Fatih", "12215489");
        ht.put("İclal", "123356856489");
        ht.put("Safak", "123445459");

        System.out.println("ht = " + ht);

        ht.put("null", "16546413546");
        //ht.put(null, "16546413546");

        System.out.println("ht = " + ht);

        //task ikinci bir hastable create edeek putAll methodunu calisiniz

        Hashtable <String, String> ht2 = new Hashtable<String, String>();

        ht2.put("asdasd","46464");
        ht2.put("asdfgs","45257464");

        System.out.println("ht2 = " + ht2);

        ht.putAll(ht2);

        System.out.println("ht = " + ht);


    }
}
