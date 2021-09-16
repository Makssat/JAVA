package Array;

import java.util.Arrays;

public class multiDimentional {
    public static void main(String[] args) {
        String[][]states=new String[3][2];
        states[0][0]="NY";
        states[0][1]="PA";
        states[1][0]="IL";
        states[1][1]="OH";
        states[2][0]="CA";
        states[2][1]="WA";
        System.out.println(Arrays.deepToString(states));
        for(int i=0;i<states.length;i++){
            for(int j=0;j<states[i].length;j++){
                System.out.println(states[i][j]);
            }
        }
        String info="@info.com";
        for(String[] st:states){
            for(String s:st){
                System.out.println(s.toLowerCase()+info);


            }
        }



    }
}
