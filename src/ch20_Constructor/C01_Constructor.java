package ch20_Constructor;

public class C01_Constructor {

    /*
            1- constructor ismi Class name ile aynı olmalı.Buyuk harf ile başlamalı
   2- constructor create eedildigğinde name den sonra () {} mutlaka kullanılmalı
   3- eger p'li cons. create edilirse java default cons ezer(siler)
            4- cons. return type olmaz method'dan ayıran özelliğidir.
            5-Class create edildiginde java default cons. kendi create eder.
    */

    String str;
    String selam="hello world";



    public static void main(String[] args) {
        C01_Constructor obj1 =new C01_Constructor();

        C01_Constructor obj2 =new C01_Constructor();
        C01_Constructor obj3 =new C01_Constructor();
        C01_Constructor obj4 =new C01_Constructor();

        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj1.selam = " + obj1.selam);

        obj1.str="javAslan";
        obj2.str="javAtar";
        System.out.println("obj3.selam = " + obj3.selam);
        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj4.str = " + obj4.str);

        obj2.method();
        obj4.method();

    }

    private void method() {

    }


}
