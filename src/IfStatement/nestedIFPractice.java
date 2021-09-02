package IfStatement;

import java.util.Scanner;

public class nestedIFPractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter city name");
        String city= input.nextLine();
        if(city.equalsIgnoreCase("Chicago")){
            System.out.println("Please enter school name");
            String scool=input.nextLine();
            if (scool.equalsIgnoreCase("Techtorial")){
                System.out.println("You are luck to be B10");
            }else {
                System.out.println("Please come and visit us");
            }

        }else{
            System.out.println("Please come to chicago");
        }

    }
}
