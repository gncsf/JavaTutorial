package ch20_Constructor;

public class C02_Arac {

    String marka ;
    String model;
    int yil;
    boolean vitesAuto;
    int km;
    boolean ikinciEl;
    String tramer;
    double motorHacmi;

    public static void main(String[] args) {

        C02_Arac arac1= new C02_Arac();

        arac1.ikinciEl=true;
        arac1.marka="mercedes";
        arac1.km=50000;
        arac1.model="CLA";
        arac1.motorHacmi=2.0;
        arac1.tramer="5 kaza var.";
        arac1.yil=2022;
        arac1.vitesAuto= true;


        System.out.println("arac1 = " + arac1);



    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", vitesAuto=" + vitesAuto +
                ", km=" + km +
                ", ikinciEl=" + ikinciEl +
                ", tramer='" + tramer + '\'' +
                ", motorHacmi=" + motorHacmi +
                '}';
    }

}
