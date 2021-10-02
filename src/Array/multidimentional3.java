package Array;

import java.util.Arrays;

public class multidimentional3 {
    public static void main(String[] args) {
        int[][] multiDem={{60650,60670,60788},{90123,90456,90543},{543,123,4214325,234343}};
       // multiDem[2][4]=5432;//Out of bond exception there is no 4th element
        System.out.println(Arrays.deepToString(multiDem));
    }
}
