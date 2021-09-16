package loop;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double balance= 100;
        while(balance>0){
            System.out.println("How much do you wannt to spend?");
            double spending= input.nextDouble();
            if (spending<=balance){
                balance-=spending;
                System.out.println("Your left balance is "+balance);

            }else{
                System.out.println("You dont have enough money "+balance);
            }

        }
    }
}
