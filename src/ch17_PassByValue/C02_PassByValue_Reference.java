package ch17_PassByValue;

public class C02_PassByValue_Reference {
    public static void main(String[] args) {

        double fiyat =100;

        System.out.println("method call oncesi fiyat = "+ fiyat);

        indir11(fiyat);
        indir22(fiyat);
        indir33(fiyat);

        System.out.println("method call sonrasi fiyat = "+ fiyat);









    }

    private static double indir33(double fiyat) {
        return fiyat *= 0.67;


    }

    private static double indir22(double fiyat) {
        return fiyat *= 0.78;
    }

    private static double indir11(double fiyat) {

        return fiyat *= 0.89;
    }
}
