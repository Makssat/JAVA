package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number 0-20");
        int number=input.nextInt();
        if(number>=0 && number<=5){
            System.out.println("Your numebr is between 0-5");
        }else if(number>=6&&number<=10){
            System.out.println("Your number in range 6-10");
        }else if(number>=11&&number<=15){
            System.out.println("your numebr is 11-15");
        }else if (number>=16&&number<=20){
            System.out.println("Your number is between 16-20");
        }

    }
}
