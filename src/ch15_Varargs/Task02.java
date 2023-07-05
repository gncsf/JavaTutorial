package ch15_Varargs;

public class Task02 {

    public static void main(String[] args) {

        int [] arr1={1,2,3,4,5,66};














    }
    public static int toplaCarp(int... var){
        int sonuc=0;
        for (int i=1; i<var.length; i++) {

            sonuc+=var[i];

        }
        sonuc *=var[0];


        return sonuc;
    }
}
