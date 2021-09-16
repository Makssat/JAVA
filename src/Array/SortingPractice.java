package Array;

import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int numbers[]={45,34,7,86,24,32,87,0,1};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);//sort method will put in ascending order(smallest to larger)
        System.out.println(Arrays.toString(numbers));
        String [] colors={"Red","Yellow","brown","White","Orange","Green","Pink","Black"};
        System.out.println(Arrays.toString(colors));
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
    }
}
