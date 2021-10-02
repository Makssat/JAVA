package ExtraExamples;

import java.util.Arrays;

public class DuplicateRemoving {
    public static void main(String[] args) {
///**
// * Write a method that will accept one array as parameter and will remove duplicates
// * and return will have unique numbers inside
// *
// * for example:
// * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
// * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
        int []numbers={3,6,8,3,2,7,9,9};
        int [] num={-1,5,8,-1,-55,55,0};
        String duplicates="";
        for(int i=0;i< numbers.length;i++){
            for(int j= numbers.length-1;j>i;j--){
                if(numbers[i]==numbers[j]){
                    duplicates+=numbers[j]+",";
                }
            }
        }
        String [] spilitted=duplicates.split(",");
        System.out.println(Arrays.toString(spilitted));
        int [] newNumber=new int[numbers.length-4];
        for(int k=0;k< numbers.length;k++){
            if(numbers[k]==3){
                continue;

            }
            else{

            }
        }

    }
}
