package ch14_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {

        int [] [] arr = {{1, 2, 3, 4}, {5,6,1,8}, {85,25,36,}};

        int carpim=1;
        int carpim2=1;

        for (int [] i: arr) {

            for(int j :i ) {

                carpim *=j;
}
        }
        System.out.println("carpim = " + carpim);








    }
}
