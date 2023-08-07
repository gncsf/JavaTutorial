package ch31_Map;

import java.util.HashMap;

public class C08_replace {

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

        System.out.println("hm.replace(\"Apple\",\"500 $\") = " + hm.replace("Apple", "500 $"));
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"apple\", \"550 $\") = " + hm.replace("apple", "550 $"));
        System.out.println("hm = " + hm);

        //task replace methodu ile istedigniz bir key in value sunu update ediniz

        System.out.println("hm.replace(\"Samsung\", \"300 $\") = " + hm.replace("Samsung", "400 $"));
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"Samsung\", \"400 $\") = " + hm.replace("Samsung", "400 $"));
        System.out.println("hm = " + hm);






    }
}
