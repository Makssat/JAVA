package loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int numb=1;numb<11;numb++){
            System.out.println("***************");
           for(int mul=1;mul<=10;mul++) {
            System.out.println(numb + "*" + mul + "=" + (mul * numb));

           }
        }
    }
}
