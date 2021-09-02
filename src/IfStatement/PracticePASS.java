package IfStatement;

import java.util.Scanner;

public class PracticePASS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first score");
        int first=input.nextInt();
        System.out.println("Please enter second score");
        int second=input.nextInt();
        System.out.println("Please enter third score");
        int third=input.nextInt();
        double score=(first+second+third)/3;
        System.out.println("Your average score is "+score);
        if (score>=90 && score<=100){
            System.out.println("Your grade is A");
        }
        else if(score>=80&&score<=89){
            System.out.println("Your grade is B");
        }else if(score>=70&&score<=79){
            System.out.println("Your grade is C");

        }else if(score>=60&&score<=69){
            System.out.println("Your grade is D");
        }else if (score>100){
            System.out.println("Your input is incorrect");
        }

        else {
            System.out.println("You need to take again this course!!!");
        }

    }
}
