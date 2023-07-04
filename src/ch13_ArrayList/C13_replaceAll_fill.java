package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {

    public static void main(String[] args) {

        ArrayList<Integer> listNumber= new ArrayList<> (Arrays.asList(1,3,55,66,1,44,25,3));

        System.out.println("listNumber = " + listNumber);

        System.out.println("Collections.replaceAll(listNumber, 1,111) = " + Collections.replaceAll(listNumber, 1, 111));

        System.out.println("listNumber = " + listNumber);

        Collections.fill(listNumber,33);

        System.out.println("listNumber = " + listNumber);




    }
}
