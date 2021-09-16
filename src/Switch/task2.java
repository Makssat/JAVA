package Switch;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Whats your favorite color?");
        String color= input.nextLine().toLowerCase().trim();
        switch(color){
            case "blue":
                System.out.println("My favorite color is blue too");
                break;
            case "red":
                System.out.println("I also liek color red");
            break;
            case "green":
                System.out.println("Green is more natural");
            break;
            case "pink":
                System.out.println("Most women like pink");
                break;
            default:
                System.out.println("There is no matching color");
        }
    }
}
