package ArrayList;

import Constructor.Car;


import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Object [] objects={2,true,"yes","no",2.5,new Car()};
        List<Object>list=Arrays.asList(objects);
        System.out.println(list.size());
        //list.add("new element"); array size is fixed
        System.out.println(list);

    }
}
