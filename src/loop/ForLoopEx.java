package loop;

import java.util.Scanner;

public class ForLoopEx {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(;num<=10;){

            System.out.println(num);
            num++;

        }
    }
}
