package Set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        String [] colors={"Red","Black","White","Pink","Violet","Red","Black"};

        List<String> list = Arrays.asList(colors);//Converted to ArrayList
        //HashSet hashSet=new HashSet(list);
        ArrayList list2=new ArrayList();
        HashSet set2=new HashSet();
        for(String color :colors){
            if(!set2.add(color)){
                list2.add(color);
            }

        }
        System.out.println(list2);




    }
}
