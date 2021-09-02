package IfStatement;

import java.util.Scanner;

public class elsePractice {
    public static void main(String[] args) {
        System.out.println("Please enter  a integer number");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if (number%2==0) {
            System.out.println("Its even number");
        }
        else{
            System.out.println("Its odd number");
        }
    }
}
