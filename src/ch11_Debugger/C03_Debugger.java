package ch11_Debugger;

public class C03_Debugger {

    static int count=7;
    public static void main(String[] args) {


        mtehod01();



    }//main sonu

    private static void mtehod01() {

        System.out.println("**** method 01 calisiyor");

        int a =0;

        count++;

        for(int i=0; i<=10; i++) {
            System.out.println(i+" ");
            a +=2*i;

        }

        System.out.println();
        System.out.println("**** method 02 call ediliyor*****");
        method2();


    }

    private static void method2() {

        System.out.println("***** method 02 calisiyor");
        count +=5;
         for (int x = 0; x <=10;  x++) {

             System.out.println(x +" ");


         }
    }
}//class sonu
