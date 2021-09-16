package loop;

import java.util.Random;
import java.util.Scanner;

public class HeadOrTail {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        String answer;
       do{
           System.out.println("Game started,make a guess! HEAD/TAIL");
           String guess= input.nextLine();
           int randnum=random.nextInt(2);
           String flip=randnum==0 ? "Head":"Tail";
           if(guess.equalsIgnoreCase(flip)){
               System.out.println("You are lucky,its your day!");
           }else{
               System.out.println("Sorry,that was not the correct choice!");
           }
           System.out.println("do you want play again? Y/N");
           answer= input.nextLine();
       }while(answer.equalsIgnoreCase("Y"));
        System.out.println("Its ok,see you next time!");

    }
}
