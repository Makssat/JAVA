package loop;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= input.nextInt();
        int a=1;
        while(a<11){
            System.out.println(number+"*"+a+"="+(number*a));
            a++;

        }
    }
}
