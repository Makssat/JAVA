package Array;

import java.util.Arrays;

public class BiggetsNumberArray {
    public static void main(String[] args) {
        int [] numbers={45,5,6,47,57,8,12,0,30};
        int biggest=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if (numbers[i]>biggest){
                biggest=numbers[i];
            }
        }
        System.out.println(biggest);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);
    }
}
