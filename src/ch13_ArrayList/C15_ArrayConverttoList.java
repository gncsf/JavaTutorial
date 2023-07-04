package ch13_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C15_ArrayConverttoList {

    public static void main(String[] args) {

        String [] names= {"ali", "ahmet", "mehmet"};

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        List<String> nameList= Arrays.asList(names);

        System.out.println("nameList = " + nameList);


    }
}
