package Array;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] zipCodes={123,456,789};
        System.out.println(zipCodes.length);
        Object[] objects={"Red","Blue",55,'A',null,false};
        for(int i=0;i<objects.length;i++){
            System.out.println(objects[i]);
        }
        boolean[]conditions={true,false,true,5==5,5!=5};
        System.out.println(Arrays.toString(conditions));
    }
}
