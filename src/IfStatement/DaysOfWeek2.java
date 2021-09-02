package IfStatement;

import java.util.Scanner;

public class DaysOfWeek2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first letter of days");
        String days=input.nextLine();
        if(days.equalsIgnoreCase("M")){
            System.out.println("it is Monday");
        }
        if(days.equalsIgnoreCase("T")){
            System.out.println("its Tuesday or Thursday");
        }
        if(days.equalsIgnoreCase("W")){
            System.out.println("Its wednesday");
        }
        if(days.equalsIgnoreCase("F")){
            System.out.println("Its friday");
        }
        if(days.equalsIgnoreCase("S")){
            System.out.println("its saturday or sunday");
        }
        else {
            System.out.println("Sorry");
        }

    }
}
