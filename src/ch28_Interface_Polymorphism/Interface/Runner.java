package ch28_Interface_Polymorphism.Interface;

import java.util.ArrayList;
import java.util.List;

import static ch28_Interface_Polymorphism.Interface.C03_DisDonanim.RENK;

public class Runner {

    public static void main(String[] args) {

        C06_Passat passat = new C06_Passat();
        passat.ebat();
        passat.jant();
        passat.kaporta();
        passat.klima();
        passat.kapi();
        passat.koltuk();
        passat.sunroof();
        passat.motor();
        passat.sisLamp();
        passat.yakit();


        System.out.println("C05_Lastik.RENK = " + C05_Lastik.RENK);

        System.out.println("C04_IcDonanim.KUMAS = " + C04_IcDonanim.KUMAS);
        System.out.println("RENK = " + RENK);

        // TASK polymorphism kullanrak passat objesi create edin

       List<String> list = new ArrayList<String>();

       C04_IcDonanim passat1 = new C06_Passat();

       ((C06_Passat) passat1).motor();
       passat1.klima();
       ((C06_Passat) passat1).yakit();






    }
}
