package loop;

import java.util.Scanner;

public class Practice3 {
    Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
    int number=input.nextInt();
    int divisor=1;
    while(divisor<=number){
if (number%divisor==0){
    System.out.println(divisor);
}divisor++;
    }

    }
}
