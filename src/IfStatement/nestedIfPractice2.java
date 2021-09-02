package IfStatement;

import java.util.Scanner;

public class nestedIfPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("All answers should be yes/no");
        System.out.println("Do you know JAVA?");
        String java1= input.nextLine();
        if(java1.equalsIgnoreCase("YES")){
            System.out.println("Do you know selenium");
            String selenium= input.nextLine();
            if(selenium.equalsIgnoreCase("YES")){
                System.out.println("Do you know API testing?");
                String api= input.nextLine();
                if(api.equalsIgnoreCase("YES")){
                    System.out.println("Do you know SQL");
                    String sql= input.nextLine();
                    if(sql.equalsIgnoreCase("YES")){
                        System.out.println("CONGRATS,YOU ARE HIRED");
                    }else{
                        System.out.println("SOrry we need someone who knows SQL");
                    }
                }else {
                    System.out.println("Sorry we need someone who knows API testing");
                }
            }else {
                System.out.println("Sorry we need someone who has knowledge on SELENIUM");
            }

        }else{
            System.out.println("Please learn java!!!");
        }

    }
}
