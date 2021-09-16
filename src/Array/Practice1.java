package Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[]numbers=new int [5];
        numbers[0]=11;
        System.out.println(numbers);//HashCode place of Array
        System.out.println(numbers[0]);//showing 11
        System.out.println(numbers[1]);//showing 0 , nothing stored
        numbers[1]=22;
        numbers[4]=44;
        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(numbers));
        for(int index=0;index<numbers.length;index++){
            System.out.print(numbers[index]+",");
        }

    }
}
