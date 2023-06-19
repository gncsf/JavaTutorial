package ch10_Method_Cretion;

public class C04_methodOverloading {

    public static void main(String[] args) {

        String str = "tam oturmasi icin birkac ornek daha gerekir ";
        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o"));

        System.out.println("str.indexOf(\"25\") = " + str.indexOf("25"));

        System.out.println("overloading");

        topla();

        topla(1,5);

        System.out.println("topla(1,3,5) = " + topla(1, 3, 5));

        System.out.println("topla('a','b') = " + topla('a', 'b'));

        System.out.println("topla(\"A\", \"B\") = " + topla("A", "B"));


    }

    private static String topla(String a, String b) {
        return a+b;
    }

    private static int topla(int i, int i1, int i2) {
        return i+i1+i2;

    }

    private static int topla(int i, int i1) {
        return i+i1;

    }

    private static void topla() {


    }

    //aaaa
}
