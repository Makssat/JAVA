package IfStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DiscountTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter amount");

        double payment= input.nextDouble();
        if(payment>=100 ){
            System.out.println(("Total amount of paymentis -->")+(payment-(payment*.20)));

        }
        else{
            System.out.println(("You amount is-->")+(payment-(payment*.05)));
        }
    }
}
