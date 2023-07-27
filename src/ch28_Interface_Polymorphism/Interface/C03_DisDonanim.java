package ch28_Interface_Polymorphism.Interface;

public interface C03_DisDonanim {


    public abstract  void kapi();

    void kaporta();

    String RENK= "siyah";

    public default String sisLamp() {
       return "sisli havada otomatik calisir";
    }



}
