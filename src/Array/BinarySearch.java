package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] studentNumber={10,15,12,20,30,35,50};
        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber));
        System.out.println(Arrays.binarySearch(studentNumber,35));
        System.out.println(Arrays.binarySearch(studentNumber,-25));
        System.out.println(Arrays.binarySearch(studentNumber,10));

    }
}
