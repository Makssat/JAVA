package loop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] colors={"Red","Yellow","brown","White","Orange","Green","Pink","Black"};
        Arrays.sort(colors);
        for(String color:colors){
            //Its called for each looop:From beginnings till end
            System.out.print(color.toUpperCase()+" ");


        }
        System.out.println("");
        int [] ids={3,4,5,4645,745,23,54,76};
        for(int numberId:ids){
            if (numberId>=50){
            System.out.print(numberId+" ");
        }
        }
        char[] characters={'A','c','1','$','H'};
        System.out.println(" ");
        for(char ch:characters){
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                System.out.print(ch+" ");
            }
        }
        System.out.println("*************************");
        for(char ch1: characters){

          if(!Character.isAlphabetic(ch1) || !Character.isDigit(ch1)) {
              System.out.println(ch1);
          }

        }
    }
}
