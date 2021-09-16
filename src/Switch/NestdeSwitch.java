package Switch;

import java.util.Scanner;

public class NestdeSwitch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Which department are looking for?" +
                " IT is -->1," +
                "HR-->2," +
                "REP-->3");
        int department= input.nextInt();
        switch (department){
            case 1:
                System.out.println("Which person would you liek to connect?");
                System.out.println("Raj,Alex,Jessi");
                String name1= input.nextLine().toUpperCase();
                 name1= input.nextLine().toUpperCase();
                switch(name1){
                    case "RAJ":
                        System.out.println("Raj is here");
                        break;
                    case "ALEX":
                        System.out.println("Alex is here");
                        break;
                    case "JESSI":
                        System.out.println("Jessi is here");
                        break;
                    default:
                        System.out.println("IT has no this person");
                        break;
                }break;
            case 2:
                System.out.println("Which person want to connect?");
                System.out.println("Ana,Tima");
                String name2=input.nextLine().toUpperCase();
                 name2=input.nextLine().toUpperCase();
                switch (name2){
                    case "ANA":
                        System.out.println("Ana is here");
                        break;
                    case "TIMA":
                        System.out.println("Tima is here");
                        break;
                    default:
                        System.out.println("HR has no this people");
                }break;
            case 3:
                System.out.println("Which person you like to talk?");
                System.out.println("Jeremiah,John,David");
                String name3= input.nextLine().toUpperCase();
                 name3= input.nextLine().toUpperCase();
                switch (name3){
                    case "JEREMIAH":
                        System.out.println("Jeremiah is here");
                        break;
                    case "JOHN":
                        System.out.println("John is here");
                        break;
                    case "DAVID":
                        System.out.println("David is here");
                        break;
                    default:
                        System.out.println("REP has no this person");


                }  break;
            default:
                System.out.println("Entered invalid number***");

        }

    }
}
