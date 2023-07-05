package ch14_ForEachLoop;

public class C03_forEachLoop {

    public static void main(String[] args) {

        // task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
        // ortaklari yazdirancode create ediniz.. with for-each

        String [] arr1 = {"hayri", "zeynep", "ceren","cansu"};
        String [] arr2 = {"david", "john", "jeremy","angel","zeynep", "ceren","cansu"};

        for (String str : arr1) {
            for (String str2 : arr2) {
                if (str.equals(str2)) {
                    System.out.println(str);
                }
            }
        }


















    }
}
